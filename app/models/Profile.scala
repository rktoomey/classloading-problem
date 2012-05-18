package models

import com.novus.salat._
import com.novus.salat.annotations._
import com.mongodb.DBObject
import org.bson.types.ObjectId
import com.novus.salat.dao.{SalatDAO, ModelCompanion}
import com.mongodb.casbah.MongoConnection


//use the salat context from models/package.scala
import models.salatctx._

/**
 * User: andy
 */

case class Profile(billing: Billing = Billing.empty) {

}

object Profile {
  // more efficient object allocation
  val empty = Profile()
}
