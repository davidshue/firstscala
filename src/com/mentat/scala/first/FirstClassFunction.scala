package com.mentat.scala.first

object FirstClassFunction extends App {
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  println(someNumbers)
  
  println(someNumbers.filter(_ > 0))
  assert(List(5, 10) == someNumbers.filter(_ > 0))
  
  someNumbers.foreach(println)
  
  def sum(a: Int, b: Int, c: Int) = a + b + c
  
  println(sum(1, 2, 3))
  
  val a = sum _
  
  println(a(2,3,4))
  assert(9 == a(2, 3, 4))
  
  val b = sum(1, _: Int, 3)
  
  println(b(6))
  assert(10 == b(6))
  
}