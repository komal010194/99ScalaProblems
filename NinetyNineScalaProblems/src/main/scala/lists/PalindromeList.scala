package lists

object PalindromeList {
  def main(args: Array[String]): Unit = {
//    println(palindromeValidationBF(List(1,2,3,2,1)))
//    println(palindromeValidationBF(List(1,2,3,2,1,1)))

    println(palindromeValidationTR(List(1,2,3,2,1)))
   println(palindromeValidationTR(List(1,2,3,2,1,1)))

    println(palindromeValidationTR(List('1','2','3','2','1')))
    println(palindromeValidationTR(List('1','2','3','2','1','1')))

  }

  def palindromeValidationBF(ls: List[Int]): Boolean = {
    var counter = 0
    var lastIndex = ls.length - 1
    for(i<-0 until (ls.length - 1)/2) {
        if(ls(i) == ls(lastIndex)) {
          counter = counter + 1
          lastIndex = lastIndex - 1
        }
        else counter = counter + 0
      }
    if(counter == ls.length/2)  true
    else false
  }

  def palindromeValidationTR[A](ls: List[A]): Boolean = {
    def pv(reverseList: List[A], index: Int, counter: Int): Int ={
      reverseList match {
        case Nil => counter
        case head :: tail => if(head == ls(index)) pv(tail, index+1, counter + 1)
        else pv(tail, index+1, counter)
      }
    }
    val count = pv(ls.reverse, 0, 0 )
    if(count == ls.length)  true
    else false
  }
}
