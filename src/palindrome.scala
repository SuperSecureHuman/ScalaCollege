object palindrome {

  def isPalindrome(str: String ): Boolean = {
    for (i <- 0 until str.length){
      if (str(i) != str(str.length - i - 1)){
        return false
      }
    }
    return true
  }

  def main(args: Array[String]) : Unit = {
    println(isPalindrome("meowwoem"))
  }

}
