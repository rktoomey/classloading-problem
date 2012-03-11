package models

import com.novus.salat._
import com.novus.salat.annotations._
import com.mongodb.DBObject


//use the salat context from models/package.scala
import models.salatctx._

/**
 * User: andy
 */

case class Profile(billing: Billing = Billing()) {

}

object Profile {
  def graterProfile(implicit ctx:Context): Grater[Profile] = {
    println(ctx)
    grater[Profile]
  }

  //For now, always use the function grater that returns the Grater instance we need. It will use some caching mechanism, that won't break on reloading 
  //since the cache works on class object, so if the class is reloaded the cached grater is not use and a new one is built
  //def to(p:Profile) = grater[Profile].asDBObject(p)
  def to(p:Profile):DBObject= graterProfile.asDBObject(p)

  def from(m:DBObject):Profile = graterProfile.asObject(m)

}
