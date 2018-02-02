package example

import scala.collection.generic.CanBuildFrom
import scala.io.StdIn

object indexmultiples extends App {


  val x = List(2, 4, 7, 9, 10)

  val y = x.zipWithIndex.tail

  val z = y.filter(x => x._1 % x._2 == 0)

  print(z.map(x => x._1))

  //*****************************************************************************************//

//  val input = StdIn.readLine("Enter numbers and I will return whether they're multiples of their indices")
//  def index(input: List[Int]): List[Int] =
//    input
//    .zipWithIndex
//    .tail
//    .filter(x => x._1 % x._2 == 0)
//    .map(x => x._1)

  //**************************************************************************************//

  //  val numList = StdIn.readLine("input you're numbers  \n").toList
  //  val tuples = numList.zipWithIndex.tail
  //  val filterNumList = tuples.filter(numList => numList._1 % numList._2 == 0)
  //  print(filterNumList.map(numList => numList._1))

}










