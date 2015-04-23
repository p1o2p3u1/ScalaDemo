package demo.service

import akka.actor.Actor
import spray.http.MediaTypes._
import spray.routing._

class ServiceActor extends Actor with MyService {
  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(route)
}

trait MyService extends HttpService {
  import spray.httpx.SprayJsonSupport._

  lazy val route = {
    path("") {
      respondWithMediaType(`text/html`){
        complete{
          <html>
            <body>
              <h1>The Service is running :-)</h1>
            </body>
          </html>
        }
      }
    }
  }
}