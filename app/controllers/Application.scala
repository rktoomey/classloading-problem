package controllers

import play.api._
import play.api.mvc._
import com.mongodb.casbah.Imports
import models._
import models.salatctx._


object Application extends Controller {
  
  def index = Action {
    //Necessary to blow the recompilation...
    val user = User()
    val to: Imports.DBObject = Profile.to(user.profile)
    println(to.toMap.toString)

    Ok(views.html.index("Tet me 9"))
  }
  
}
