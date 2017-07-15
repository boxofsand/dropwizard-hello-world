package com.example

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

import com.codahale.metrics.annotation.Timed

@Path("/example")
class HelloWorldResource() {

  @GET
  @Timed
  @Produces(Array(MediaType.APPLICATION_JSON))
  def sayHello(): Response = {
    Response.ok.entity(new User("jshah", "test@test.com")).build()
  }

}
