package lists

object ListCount {
  def main(args: Array[String]): Unit = {
    //inbuilt solution

    List(1, 2, 3, 4, 5, 6, 7, 8).length

    println(countElement(List(1, 2, 3, 4, 5, 6, 7, 8)))
  }

  def countElement(ls: List[Int]): Int = {
    def numOfElements(ls: List[Int], count: Int): Int = {
      ls match {
        case Nil => count
        case head :: tail => numOfElements(tail, count+1)
      }
    }
    numOfElements(ls, 0)
    }
  }

