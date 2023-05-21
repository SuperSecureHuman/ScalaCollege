import scala.Array

object ArrayFirstLastCheck {

  def main(args: Array[String]): Unit = {

    var z = Array(0,1,203,4,6,8,3,0)
    //print(z(0))
    if (z(0) == z(z.length - 1)) {
      println("Same")
    }
    else {
      println("Different")
    }
  }

}