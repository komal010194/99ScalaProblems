package lists

import scala.annotation.tailrec

object ListCount {
  def main(args: Array[String]): Unit = {
    //inbuilt solution

    List(1, 2, 3, 4, 5, 6, 7, 8).length

    println(countElement(List(1, 2, 3, 4, 5, 6, 7, 8)))
    println(countElement(List("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx")))
  }

  def countElement[A](ls: List[A]): Int = {
    @tailrec
    def numOfElements[A](ls: List[A], count: Int): Int = {
      ls match {
        case Nil => count
        case head :: tail => numOfElements(tail, count+1)
      }
    }
    numOfElements(ls, 0)
    }
  }

