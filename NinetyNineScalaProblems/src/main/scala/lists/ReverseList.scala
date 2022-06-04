package lists

import scala.::

object ReverseList {
  def main(args: Array[String]): Unit = {

    println(reverseList(List(1, 2, 3, 4, 5, 6, 7, 8)))
  }

  def reverseList(ls: List[Int]): List[Int] = {
    def reverse(resList: List[Int], curList: List[Int]): List[Int] = {
      curList match {
        case Nil => resList
        case head :: tail => reverse(head :: resList,  tail)

      }
    }
    reverse(List.empty[Int], ls)
  }
}
