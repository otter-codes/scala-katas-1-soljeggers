package example

import scala.collection.generic.CanBuildFrom
import scala.io.StdIn

object indexmultiples extends App {


  val x = List(2, 4, 7, 9, 10,50)

  val y = x.zipWithIndex.tail

  val z = y.filter(x => x._1 % x._2 == 0)

  print(z.map(x => x._1))




 // ***********************************************************************************************//
//val TheList = List(2, 4, 7, 9, 10,50)
//
//
//  val refined = TheList.zipWithIndex
//                       .tail
//                        .filter(x => x._1 % x._2 == 0)
//                        .map(x => x._1)
//
//  println(refined)
//
//  // with the assistance nick
//
//}




//  //*****************************************************************************************//
//
//  val input = StdIn.readLine("Enter numbers and I will return whether they're multiples of their indices")
//
//  def index(input: List[Int]): List[Int] =
//    input
//    .zipWithIndex
//    .tail
//    .filter(x => x._1 % x._2 == 0)
//    .map(x => x._1)

  //**************************************************************************************//
//
//    val numList: Seq[Int] = StdIn.readLine("input you're numbers  \n").split(",").toList.map(x => x.toInt)
//    val tuples = numList.zipWithIndex.tail
//    val filterNumList = tuples.filter(numList => numList._1 % numList._2 == 0)
//    print(filterNumList.map(numList => numList._1))
//

}










