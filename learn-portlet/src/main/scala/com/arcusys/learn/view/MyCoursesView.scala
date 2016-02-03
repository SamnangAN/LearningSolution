package com.arcusys.learn.view

import javax.portlet.{RenderRequest, RenderResponse}

import com.arcusys.learn.view.extensions.{BaseView, OAuthPortlet}

class MyCoursesView extends OAuthPortlet with BaseView {
  override def doView(request: RenderRequest, response: RenderResponse) {
    implicit val out = response.getWriter
    val securityScope = getSecurityData(request)

    sendTextFile("/templates/2.0/my_courses_templates.html")
    sendTextFile("/templates/2.0/common_templates.html")
    sendMustacheFile(securityScope.data, "my_courses.html")
  }
}