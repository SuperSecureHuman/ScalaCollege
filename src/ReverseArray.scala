object ReverseArray {

  def main(args: Array[String]): Unit = {

    var z = Array(1,2,3,4,5,6,7,8,9,0)
    var x = new Array[Int](z.length)

    for (i <- z.length -1 to 0 by -1){
      x(z.length - 1 - i) = z(i)
    }
    println(x.mkString("Array(", ", ", ")"))
  }
}
