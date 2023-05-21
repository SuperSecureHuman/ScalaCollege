object PrintRepeatedChars {


  def printRepeatedCharacters(str: String): Unit = {
    val repeatedCharacters = scala.collection.mutable.Set[Char]()

    for (i <- 0 until str.length - 1) {
      var count = 1
      for (j <- i + 1 until str.length) {
        if (str(i) == str(j)) {
          count += 1
          if (count > 2) {
            repeatedCharacters += str(i)
          }
        }
      }
    }

    repeatedCharacters.foreach(println)
  }


  def main(args: Array[String]): Unit = {

    val inputString = "thisisatestinput"
    printRepeatedCharacters(inputString)
  }

}
