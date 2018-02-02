package example

import scala.io.StdIn

// request an input
// remove the first and last character from input
// print remaining characters
// if less than 2 chars return empty string

object removeFirstnLast extends App {

  val input = StdIn.readLine("Input a word, I'll remove the first and last character \n")
  val x = input.slice(1, input.length -1)
  println(x)


//   def removeSpace(input: String): String =
//    if (input.length <= 2) {
//      ""
//    } else {
//      input.substring(1, input.length - 1)
//    }
//  }

}
