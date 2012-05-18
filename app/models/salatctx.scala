package models

import com.novus.salat.Context
import play.api.Play
import play.api.Play._

/**
 *
 * User: noootsab
 * Date: 11/03/12
 * Time: 10:59
 */

package object salatctx {
  /**
   * Here is a custom context which always maps a field called "_id" to "id"
   */
  implicit val ctx = {
    val c = new Context {
        val name = "play-context"
      }
    c.registerGlobalKeyOverride(remapThis = "id", toThisInstead = "_id")
    c
  }

  // Registering the play classloader is no longer necessary with Play 2.0
  // Please see https://github.com/novus/salat/wiki/SalatWithPlay

}
