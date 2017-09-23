
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/pojo_scala/conf/routes
// @DATE:Sat Sep 23 09:32:31 COT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
