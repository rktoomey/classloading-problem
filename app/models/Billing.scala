package models

import models.salatctx._

/**
 * User: andy
 */

object Billing {
  // more efficient object allocation!
  val empty = Billing(data = "")
}

case class Billing(data: String = "") {

}
