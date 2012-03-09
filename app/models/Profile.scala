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
  val graterProfile: Grater[Profile] = grater[Profile]
}