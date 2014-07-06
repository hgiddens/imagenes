package imagenes

import spray.routing._

class Imagenes extends HttpServiceActor {
  def receive = runRoute {
    complete("¡Hola, \ud83d\udc30!")
  }
}
