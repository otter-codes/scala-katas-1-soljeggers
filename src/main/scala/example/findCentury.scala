package example

import scala.io.StdIn

object findCentury extends App {

  val year   = StdIn.readLine("Give me a year, I'll tell you the century: \n ").toInt

  val century = (((year-1)/100)+1)

  println(century)

//  val x = century
//
//  def century(year : Int) = {
//    if (inputYear % 100 == 0)
//      println(year)
//  } else {
//    inputYear / 100 + 1
//
//  }


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




