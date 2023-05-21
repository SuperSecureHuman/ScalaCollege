object SumPrimeEven {

  def checkPrime(a:Int) : Boolean = {
    var i = 2

    if(a == 1){
      return false
    }

    if (a == 2){
      return true
    }

    while (i < a){
      if (a % i == 0){
        return false
      }
      i = i + 1

    }
    return true
  }

  def main(args: Array[String]): Unit = {

    var a = Array(1,2,3,4,5)

    var sum = 0

    for(i <- 0 until a.length){
      if (checkPrime(a(i)) || (a(i) % 2 == 0)){
        sum = sum + a(i)

      }
    }
    println(sum)

  }

}
