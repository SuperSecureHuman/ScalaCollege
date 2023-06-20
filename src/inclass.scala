object inclass {

  def fun(x: Int) = {
    if (x > 5) {
      x * 3
    } else if (x > 0) {
      x * 2
    } else {
      x
    }
  }


  //nested function to do the same thing as above
  def nestedfun(x:Int):Int = {
    def double(x:Int):Int = {
      x * 2
    }
    def triple(x:Int):Int = {
      x * 3
    }
    if (x > 5) {
      triple(x)
    } else if (x > 0) {
      double(x)
    } else {
      x
    }
  }


  

  def main(args: Array[String]):Unit = {
    println(nestedfun(10))
  }
}
