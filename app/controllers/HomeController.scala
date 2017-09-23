package controllers

import javax.inject._

import play.api._
import play.api.mvc._
import models.Place
import play.api.libs.json.{JsError, JsSuccess, Json}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  var places = List(
    Place(1,"Barbosa", Some("Municipio")),
    Place(2,"UdeA", Some("Universidad")),
    Place(3,"Belen", None),
    Place(4,"Rionegro", None)

  )

  def listPlaces = Action{
    val json = Json.toJson(places)
    Ok(json)
  }

  def addPlace = Action{
    request => val json = request.body.asJson.get
      json.validate[Place] match {
        case success: JsSuccess[Place] =>
          places = places :+ success.get
          Ok("")
        case error: JsError =>
          BadRequest(Json.toJson(Map("error" ->"error")))
      }
  }

  def removePlace(id: Int) = Action{
    places = places.filterNot( _.id == id )
    Ok(Json.toJson(Map("Response" -> "Eliminado")))
  }

  def updatePlace = Action{
    request => val json = request.body.asJson.get
      json.validate[Place] match {
        case success: JsSuccess[Place] =>
          val newPlace = Place(success.get.id, success.get.name, success.get.description)
          places = places.map(x => if(x.id == newPlace.id)newPlace
          else x)
          Ok("")
        case error: JsError =>
          BadRequest(Json.toJson(Map("error" ->"error")))
      }
  }

  def getById(id: Int) = Action{
    val place = places.filter( _.id == id )
    Ok(Json.toJson(Map("Response" -> place)))
  }

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
