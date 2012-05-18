package controllers

import play.api.mvc._
import models._


object Application extends Controller {
  
  def index = Action {

    val name = "foo_%s".format(System.currentTimeMillis())
    val u: User = User(name = name)
    println(User.toDBObject(u))
    val id = User.insert(u)
    println("id="+id)
    val user_* = User.findOneByID(u.id)
    require(user_* == Some(u))
    val user_** = User.findByUsername(name)
    require(user_** == Some(u))

    Ok(views.html.index("Tet me 9"))
  }
  
}
