package worksheet_1

object SmallestValues {

  def main(args: Array[String]): Unit = {
    val test = Array(1, 2, 7, 2, 8, 3, 6, 8, 9)

    var Smallest = Int.MaxValue
    var SecondSmallest = Int.MaxValue
    var ThirdSmallest = Int.MaxValue

    for (i <- test.indices) {
      if (test(i) < Smallest) {
        ThirdSmallest = SecondSmallest
        SecondSmallest = Smallest
        Smallest = test(i)
      }
      else if (test(i) < SecondSmallest) {
        ThirdSmallest = SecondSmallest
        SecondSmallest = test(i)
      }
      else if (test(i) < ThirdSmallest) {
        ThirdSmallest = test(i)
      }
    }
    println(s"$Smallest $SecondSmallest $ThirdSmallest")
  }
}