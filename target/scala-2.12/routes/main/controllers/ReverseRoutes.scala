
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/pojo_scala/conf/routes
// @DATE:Sat Sep 23 09:32:31 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def removePlace(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "removeId/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:12
    def getById(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeId/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:8
    def listPlaces(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "place")
    }
  
    // @LINE:11
    def updatePlace(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updatePlace")
    }
  
    // @LINE:9
    def addPlace(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addPlace")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
