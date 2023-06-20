object AreaOfShape {

  def RectArea(length: Int, breadth: Int): Int = {
    return length * breadth
  }

  def CircleArea(radius: Int): Double = {
    return 3.14 * radius * radius
  }

  def ParellogramArea(base: Int, height: Int): Int = {
    return base * height
  }

  def TrapezoidArea(base1: Int, base2: Int, height: Int): Int = {
    return ((base1 + base2) / 2) * height
  }

  def main(args: Array[String]): Unit = {
    // Recieving input from user for which shape
    println("Enter the shape for which you want to calculate area")
    println("1. Rectangle")
    println("2. Circle")
    println("3. Parellogram")
    println("4. Trapezoid")
    val shape = scala.io.StdIn.readInt()

    // Recieving input from user for dimensions
    if (shape == 1) {
      println("Enter length and breadth of rectangle")
      val length = scala.io.StdIn.readInt()
      val breadth = scala.io.StdIn.readInt()
      println("Area of rectangle is " + RectArea(length, breadth))
    } else if (shape == 2) {
      println("Enter radius of circle")
      val radius = scala.io.StdIn.readInt()
      println("Area of circle is " + CircleArea(radius))
    } else if (shape == 3) {
      println("Enter base and height of parellogram")
      val base = scala.io.StdIn.readInt()
      val height = scala.io.StdIn.readInt()
      println("Area of parellogram is " + ParellogramArea(base, height))
    } else if (shape == 4) {
      println("Enter base1, base2 and height of trapezoid")
      val base1 = scala.io.StdIn.readInt()
      val base2 = scala.io.StdIn.readInt()
      val height = scala.io.StdIn.readInt()
      println("Area of trapezoid is " + TrapezoidArea(base1, base2, height))
    } else {
      println("Invalid input")
    }


  }

}
