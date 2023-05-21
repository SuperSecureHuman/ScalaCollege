object SumEvenFibSeries {

  def even(num: Int): Boolean = {
    if (num % 2 == 0){
      return true
    }
    else {
      return false
    }
  }

  def fibSeries(numElements: Int): Array[Int] = {
    var outputArray = new Array[Int](numElements)
    outputArray(0) = 0
    outputArray(1) = 1

    for (i <- 1 until numElements - 1 )
      outputArray(i + 1) = outputArray(i) + outputArray(i-1)

    return outputArray
  }

  def main(args: Array[String]): Unit = {
    var sum = 0
    var numElements = 10
    var fibArr = fibSeries(numElements)
    for (i <- 0 until numElements){
      if (even(fibArr(i))){
        println(fibArr(i))
        sum = sum + fibArr(i)
      }
    }
    println(sum)
    println(fibArr.mkString("Array(", ", ", ")"))
  }

}
