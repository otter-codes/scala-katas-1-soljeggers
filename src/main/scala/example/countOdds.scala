package example

import scala.io.StdIn

// take number from console
// using number from console
// create a list of numbers i.e. 1 to 10
// get me a list of ints where they're even

//def odd(int: Int): List[Int] = {
//val list = List.range(1, int)
//list.filter(x => x % 2 != 0)
//}
//odd(19)


object countOdds extends App {

  val num = StdIn.readLine("What is your final number? ").toInt
  val oddNumbers = List.range(1, num ,2)
  print(oddNumbers)

}
