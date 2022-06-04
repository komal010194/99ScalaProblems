package lists

object LastElement {
  def main(args: Array[String]): Unit = {
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    //solution using inbuilt function
    println(numList.last)

    // user defined soln

    println(lastRecursive(numList))
    println(lastRecursive(List('a','c','d','e')))

  }


  def lastRecursive[A](numList: List[A]): A = {
    numList match {
      case head :: Nil => head
      case _ :: tail => lastRecursive(tail)
    }
  }
}
