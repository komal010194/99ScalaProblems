package lists

import scala.annotation.tailrec

object NthElement {

  def main(args: Array[String]): Unit = {


    //println(secondLastRecursive(List(1,2,3,4,5,6,7,8), 3))
//
//    println(nth(List(1, 2, 3, 4, 5, 6, 7, 8), 3))
//    println(nth(List('1', '2', '3', '4', '5', '6', '7', '8'), 3))
    println(findNthElement(List(1, 2, 3, 4, 5, 6, 7, 8), 3))
   println(findNthElement(List('1', '2', '3', '4', '5', '6', '7', '8'), 3))
  }

  def secondLastRecursive(numList: List[Int], n: Int): Int = {
    var nthElement = 0
    for (i <- 0 until numList.length) {
      if (i == numList.length - n) nthElement = numList(i)
    }
    nthElement


  }

  def nth[A](list: List[A], n: Int): Option[A] = {
    @tailrec
    def nthElem[A](list: List[A], acc: (Int, Int)): Option[A] =
      list match {
        case Nil => None
        case head :: tail => {
          if (acc._1 == acc._2)
            Some(head)
          else
            nthElem(tail, (acc._1 + 1, acc._2))
        }
      }

    nthElem(list, (0, n))
  }

  // using foldLeft

  def findNthElement[A](ls: List[A], index: Int): A ={
    val resList = ls.foldLeft(List[A]()) {
      (resultList, eachElement)  => if(ls.indexOf(eachElement) == index) return resultList.:+(eachElement).head
      else List[A]()
    }
    resList.head
  }
}
