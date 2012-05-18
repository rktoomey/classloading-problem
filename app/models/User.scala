package models

import com.novus.salat._
import com.novus.salat.annotations._
import com.mongodb.DBObject
import org.bson.types.ObjectId
import com.novus.salat.dao.{SalatDAO, ModelCompanion}
import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.commons.MongoDBObject


//use the salat context from models/package.scala
import models.salatctx._


/**
 * User: andy
 */

/**
 *
 * @param id it is best practice to always define this field - see MongoDB docs
 * @param profile a profile
 */
case class User(id: ObjectId = new ObjectId,
                name: String,
                profile: Profile = Profile.empty)

object User extends ModelCompanion[User, ObjectId] {
  val collection = MongoConnection()("andy")("users")
  val dao = new SalatDAO[User, ObjectId](collection = collection) {}

  def findByUsername(name: String) = dao.findOne(MongoDBObject("name" -> name))
}
