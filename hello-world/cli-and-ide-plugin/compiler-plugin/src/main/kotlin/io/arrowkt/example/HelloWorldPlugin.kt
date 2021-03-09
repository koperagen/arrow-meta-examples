package io.arrowkt.example

import arrow.meta.CliPlugin
import arrow.meta.Meta
import arrow.meta.invoke
import arrow.meta.quotes.Transform
import arrow.meta.quotes.namedFunction

val Meta.helloWorld: CliPlugin
  get() =
    "Hello World" {
      meta(
        namedFunction(
          ctx = this,
          match = { element.name == "helloWorld" }) { c ->
          Transform.replace(
            replacing = c.element,
            newDeclaration =
            """|fun helloWorld(): Unit =
               |  println("Hello ΛRROW Meta!")
               |""".function(null).syntheticScope
          )
        }
      )
    }