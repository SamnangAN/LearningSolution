package com.arcusys.learn.controllers.api.content

import com.arcusys.learn.controllers.api.base.BaseApiController
import com.arcusys.learn.exceptions.BadRequestException
import com.arcusys.learn.models.request.{CategoryActionType, CategoryRequest}
import com.arcusys.learn.models.{CategoryResponse, ContentResponseBuilder}
import com.arcusys.valamis.content.model.Category
import com.arcusys.valamis.content.service.{CategoryService, ContentService}

//TODO may be should name it ContentController?
class CategoryController extends BaseApiController with ContentPolicy {
  lazy val categoryService = inject[CategoryService]
  lazy val contentService = inject[ContentService]

  before() {
    scentry.authenticate(LIFERAY_STRATEGY_NAME)
  }

  get("/categories(/)")(jsonAction {
    val req = CategoryRequest(this)

    req.action match {
      //not used?
      case None =>
        categoryService.getByCategory(req.parentId, req.courseId)
          .map(categoryResponse)

      case CategoryActionType.AllChildren =>
        val nodes = req.parentId match {
          case Some(categoryId) => contentService.getTreeFromCategory(categoryId).nodes
          case None => contentService.getTree(req.courseId).nodes
        }
        nodes.map(ContentResponseBuilder.toResponse)

      // TODO: read counts with tree
      case CategoryActionType.ContentAmount =>
        req.parentId match {
          case Some(categoryId) => contentService.getContentCountFromCategory(categoryId)
          case None => contentService.getContentCount(req.courseId)
        }
      case _ => throw new BadRequestException
    }
  })

  post("/categories(/)")(jsonAction {
    val req = CategoryRequest(this)

    val newCategory = req.copyFromId match {
      case None =>
        categoryService.create(new Category(None,
          req.title,
          req.description,
          req.parentId,
          req.courseId)
        )
      case Some(copyFromId) =>
        categoryService.copyWithContent(copyFromId,
          req.title,
          req.description
        )
    }

    ContentResponseBuilder.toResponse(newCategory)
  })


  post("/categories/update/:id(/)")(jsonAction {
    val req = CategoryRequest(this)
    categoryService.update(
      req.id,
      req.title,
      req.description)
  })


  post("/categories/delete/:id(/)")(jsonAction {
    val req = CategoryRequest(this)
    categoryService.deleteWithContent(req.id)
  })


  post("/categories/move/:id(/)")(jsonAction {
    val req = CategoryRequest(this)
    categoryService.moveToCategory(
      req.id,
      req.parentId,
      req.courseId
    )
  })

  post("/categories/moveToCourse(/)")(jsonAction {
    val req = CategoryRequest(this)
    req.categoryIds
      .foreach(id => categoryService.moveToCourse(id, req.newCourseId, moveToRoot = true))
  })

  private def categoryResponse(category: Category) = CategoryResponse(
    category.id.get,
    category.title,
    category.description,
    category.categoryId,
    "folder",
    0, //TODO fix in categoryResponse
    0,
    "category",
    "q_" + category.id.get,
    Seq(), //TODO fix in categoryResponse
    category.courseId

  )
}
