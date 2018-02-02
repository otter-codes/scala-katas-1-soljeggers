package example

import scala.io.StdIn

object findCentury extends App {

  val inputYear = StdIn.readLine("Give me a year, I'll tell you the century: \n ").toInt

  val x = century(0)

  def century(year : Int) = {
    if (inputYear % 100 == 0)
    println(year)
  }

}


//  def century(int: Int) = {
//    if (inputYear % 100 == 0){
//      inputYear / 100
//    } else {
//      inputYear / 100 + 1
//      println(input)
//    }
//
//  }




