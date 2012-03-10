package models

import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.global._

/**
 * User: andy
 */

case class Profile(billing: Billing = Billing()) {

}

object Profile {
  //THAT's WRONG due to class reloading in dev mode !
  //val graterProfile: Grater[Profile] = grater[Profile]

  //For now, always use the function grater that returns the Grater instance we need. It will use some caching mechanism, that won't break on reloading 
  //since the cache works on class object, so if the class is reloaded the cached grater is not use and a new one is built
  def to(p:Profile) = grater[Profile].asDBObject(p)
}
