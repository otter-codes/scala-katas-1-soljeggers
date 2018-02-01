package example

import scala.io.StdIn


// Ask for an input e.g sentence or word. //
// Take input and remove all spaces - .replaceAll //


object removeSpaces extends App {

  val input = StdIn.readLine("In put your word :) ")
  val x = input.replaceAll(" ", "")
  print(x)

}
