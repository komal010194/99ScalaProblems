package lists

import scala.annotation.tailrec

object ReverseList {
  def main(args: Array[String]): Unit = {

    println(reverseList(List(1, 2, 3, 4, 5, 6, 7, 8)))
    println(reverseListElement(List(1, 2, 3, 4, 5, 6, 7, 8)))
    println(reverseList(List("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx")))
    println(reverseListElement(List("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx")))
  }

  def reverseList[A](ls: List[A]): List[A] = {
    @tailrec
    def reverse[A](resList: List[A], curList: List[A]): List[A] = {
      curList match {
        case Nil => resList
        case head :: tail => reverse(head :: resList,  tail)

      }
    }
    reverse(List.empty[A], ls)
  }

  //using foldLeft
  def reverseListElement[A](ls: List[A]): List[A] ={
    ls.foldLeft(List[A]()) { (resulList,eachElement) => resulList.+:(eachElement)  }
  }


}
