
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/pojo_scala/conf/routes
// @DATE:Sat Sep 23 09:32:31 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """place""", """controllers.HomeController.listPlaces"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPlace""", """controllers.HomeController.addPlace"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeId/""" + "$" + """id<[^/]+>""", """controllers.HomeController.removePlace(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatePlace""", """controllers.HomeController.updatePlace"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeId/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getById(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_listPlaces1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("place")))
  )
  private[this] lazy val controllers_HomeController_listPlaces1_invoker = createInvoker(
    HomeController_0.listPlaces,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listPlaces",
      Nil,
      "GET",
      this.prefix + """place""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_addPlace2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPlace")))
  )
  private[this] lazy val controllers_HomeController_addPlace2_invoker = createInvoker(
    HomeController_0.addPlace,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPlace",
      Nil,
      "POST",
      this.prefix + """addPlace""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_removePlace3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeId/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_removePlace3_invoker = createInvoker(
    HomeController_0.removePlace(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removePlace",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """removeId/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_updatePlace4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatePlace")))
  )
  private[this] lazy val controllers_HomeController_updatePlace4_invoker = createInvoker(
    HomeController_0.updatePlace,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePlace",
      Nil,
      "PUT",
      this.prefix + """updatePlace""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_getById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeId/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getById5_invoker = createInvoker(
    HomeController_0.getById(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getById",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """placeId/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_listPlaces1_route(params) =>
      call { 
        controllers_HomeController_listPlaces1_invoker.call(HomeController_0.listPlaces)
      }
  
    // @LINE:9
    case controllers_HomeController_addPlace2_route(params) =>
      call { 
        controllers_HomeController_addPlace2_invoker.call(HomeController_0.addPlace)
      }
  
    // @LINE:10
    case controllers_HomeController_removePlace3_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_removePlace3_invoker.call(HomeController_0.removePlace(id))
      }
  
    // @LINE:11
    case controllers_HomeController_updatePlace4_route(params) =>
      call { 
        controllers_HomeController_updatePlace4_invoker.call(HomeController_0.updatePlace)
      }
  
    // @LINE:12
    case controllers_HomeController_getById5_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_getById5_invoker.call(HomeController_0.getById(id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
