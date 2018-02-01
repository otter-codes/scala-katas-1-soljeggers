package example

import scala.io.StdIn

object makingNegative extends App {

  // Request an input of number - String.toInt
  // Take number if its more than 0 make negative
  // Print function

  val input  = StdIn.readLine("Give me a number and I will turn it negative \n")toInt

  def neg: Int = {
    if(input > 0){-input}
    else input
  }
println(neg)
}


