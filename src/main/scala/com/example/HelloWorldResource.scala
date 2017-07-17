package com.example

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.MediaType.APPLICATION_JSON
import javax.ws.rs.core.Response

import com.codahale.metrics.annotation.Timed
import org.joda.time.DateTime

@Path("/example")
class HelloWorldResource() {

  @GET
  @Produces(Array(APPLICATION_JSON))
  def default: Response = {
    Response.ok.entity(Map("message" -> "Scala rocks!", "today" -> DateTime.now)).build()
  }

  @GET
  @Timed
    @Path ("/user")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def sayHello(): Response = {
    Response.ok.entity(new User("jshah", "test@test.com")).build()
  }
}
