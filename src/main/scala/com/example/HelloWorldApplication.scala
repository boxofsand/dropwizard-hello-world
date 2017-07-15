package com.example

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class HelloWorldApplication extends Application[HelloWorldConfiguration] {
  override def run(configuration: HelloWorldConfiguration, environment: Environment): Unit = {
    val helloWorld = new HelloWorldResource()
    environment.jersey().register(helloWorld)
  }

  override def initialize(bootstrap: Bootstrap[HelloWorldConfiguration]): Unit = {}
}

object HelloWorldApplication {
  def main(args: Array[String]) = {
    new HelloWorldApplication().run(args)
  }
}
