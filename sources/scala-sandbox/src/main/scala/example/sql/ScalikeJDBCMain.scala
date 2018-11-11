package example.sql

import org.slf4j.LoggerFactory
import scalikejdbc._
import scalikejdbc.config._

object ScalikeJDBCMain extends App {

  // ロガーの取得
  val logger = LoggerFactory.getLogger("application")

  // 設定ファイルを元にScalikeJDBCの設定やコネクションプールを初期化
  DBs.setupAll()

  implicit val session = AutoSession

  sql"delete from users".update().apply()

  Seq(("test1@test.com", "test1"), ("test2@test.com", "test2"), ("test3@test.com", "test3")) foreach {
    case (email, password) =>
      sql"insert into users (email,password) values ($email, $password)".update.apply()
  }

  val users: List[Map[String, Any]] = sql"select * from users".map(_.toMap).list.apply()

  logger.info(users.toString)

  // コネクションプールを破棄
  DBs.closeAll()
}

