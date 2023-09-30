package users

import zio._
import zio.http._
import zio._
import zio.http._


object App extends ZIOAppDefault {
  def run = {
    val httpApps: Http[UserRepo, Throwable, Request, Response] =
      UserApp()
    Server
      .serve(
        httpApps.withDefaultErrorResponse
      )
      .provide(
        Server.defaultWithPort(8080),

        // An layer responsible for storing the state of the `counterApp`
        ZLayer.fromZIO(Ref.make(0)),

        // To use the persistence layer, provide the `PersistentUserRepo.layer` layer instead
        InmemoryUserRepo.layer
      ) *> Console.printLine("Server started on http://localhost:8080")
  }
}
