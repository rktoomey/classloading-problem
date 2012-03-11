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
   * Here is where we define the custom Play serialization context, including the Play classloader.
   */
  implicit val ctx = {
    val c = new Context {
      val name = "play-context"
    }

    c.registerClassLoader(Play.classloader)

    c
  }

}
