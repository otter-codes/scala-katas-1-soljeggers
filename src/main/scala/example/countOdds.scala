package example

import scala.io.StdIn

// take number from console
// using number from console
// create a list of numbers i.e. 1 to 10
// get me a list of ints where they're even


object countOdds extends App {

  val num = StdIn.readLine("What is your final number? ").toInt
  val EvenNumbers = List.range(0, num ,2)
  print(EvenNumbers)

}
