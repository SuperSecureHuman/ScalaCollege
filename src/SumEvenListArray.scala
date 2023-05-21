object SumEvenListArray {

  def sumEvenPositions(collection: Seq[Int]): Int = {
    // collection: Seq[Int] - The input parameter is a sequence of integers that can be either an Array or a List or any other collection

    val evenPositionElements = collection.zipWithIndex.collect {
      // zipWithIndex - Creates a new collection of pairs, where each element is paired with its index in the original collection (Like zip in Python)

      case (element, index) if index % 2 != 0 => element
      // Collects the elements from the collection that are at odd positions (indices starting from 1)
      // index % 2 != 0 - Filters out elements at even positions
    }
    println("collection: " + collection)
    println("collection.zipWithIndex: " + evenPositionElements)
    evenPositionElements.sum
    // Calculates the sum of the elements in the even position
    // sum - Sums up all the elements in the collection
  }


  def main(args: Array[String]): Unit = {
    // Example usage
    val array = Array(1, 2, 3, 4, 5, 6)
    val list = List(1, 2, 3, 4, 5, 6)

    val sumArray = sumEvenPositions(array)
    println(s"Sum of elements in even positions of the array: $sumArray")

    val sumList = sumEvenPositions(list)
    println(s"Sum of elements in even positions of the list: $sumList")

  }

}
