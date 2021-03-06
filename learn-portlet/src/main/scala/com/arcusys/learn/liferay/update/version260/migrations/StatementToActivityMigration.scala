package com.arcusys.learn.liferay.update.version260.migrations

import com.arcusys.valamis.core.SlickProfile
import com.arcusys.valamis.settings.StatementToActivityTableComponent
import com.arcusys.valamis.settings.model.StatementToActivity
import com.liferay.portal.kernel.log.LogFactoryUtil

import scala.slick.driver.JdbcProfile
import scala.slick.jdbc.{GetResult, JdbcBackend, StaticQuery}

class StatementToActivityMigration(val db: JdbcBackend#DatabaseDef,
                                   val driver: JdbcProfile)
  extends StatementToActivityTableComponent
  with SlickProfile {

  val log = LogFactoryUtil.getLog(getClass)

  import driver.simple._

  case class OldEntity(id: Long,
                       courseId: Option[Long],
                       title: Option[String],
                       activity: Option[String],
                       verb: Option[String])

  implicit val getStatement = GetResult[OldEntity] { r => OldEntity(
    r.nextLong(),
    r.nextLongOption(),
    r.nextStringOption(),
    r.nextStringOption(),
    r.nextStringOption()
  )}

  def getOldData(implicit session: JdbcBackend#Session) = {
    StaticQuery.queryNA[OldEntity](s"SELECT * FROM learn_lflrstoactivitysetting").list
  }

  def toNewData(entity: OldEntity): StatementToActivity = {
    StatementToActivity(
      entity.courseId.getOrElse(getDefaultCourseId(entity.id)),
      entity.title.getOrElse(""),
      entity.activity,
      entity.verb
    )
  }

  private def getDefaultCourseId(entityId: Long) = {
    log.warn(s"learn_lflrstoactivitysetting with id $entityId has no courseId")
    -1
  }

  def migrate(): Unit = {
    db.withTransaction { implicit session =>
      val newRows = getOldData map toNewData
      if (newRows.nonEmpty) statementToActivity ++= newRows
    }
  }
}
