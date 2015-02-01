package com.mentat.scala.first

object Capital extends App {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital)
  println(capital("France")) 
}