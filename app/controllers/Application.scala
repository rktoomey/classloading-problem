package controllers

import play.api._
import play.api.mvc._
import models.User

object Application extends Controller {
  
  def index = Action {
    //Necessary to blow the recompilation...
    val user = User()

    Ok(views.html.index("Tet me 4"))
  }
  
}