package com.example

class User(var username: String, var email: String) {
  def this() = this("me", "me@example.com")
}
