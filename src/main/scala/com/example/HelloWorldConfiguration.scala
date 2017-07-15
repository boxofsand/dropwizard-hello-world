package com.example

import io.dropwizard.Configuration
import javax.validation.constraints.NotNull

import com.fasterxml.jackson.annotation.JsonProperty

class HelloWorldConfiguration extends Configuration {
  @NotNull
  @JsonProperty
  val template = "Hello, %s"

  @NotNull
  @JsonProperty
  val defaultName = " Stranger"
}
