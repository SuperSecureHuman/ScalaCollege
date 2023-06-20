import scala.annotation.tailrec

object NestedSumDigits {

  def sumOfDigits(number: Int): Int = {
    // Define a helper function to calculate the sum of digits recursively
    var sum = 0 // Initialize the sum variable
    def sumDigitsHelper(n: Int, sum: Int): Int = {
      if (n == 0) {
        return sum // Base case: return the final sum when n becomes 0
      } else {
        val digit = n % 10 // Extract the last digit of n
        sumDigitsHelper(n / 10, sum + digit) // Recursive call with the remaining digits and updated sum
      }
    }
    sumDigitsHelper(number, sum) // Call the helper function with the input number and initial sum
  }

  def main(args: Array[String]): Unit = {
    val number = 12345 // Assign a value to the number variable
    val sum = sumOfDigits(number) // Call the sumOfDigits function with the number
    println(s"Sum of digits of $number is $sum") // Print the result
  }

}
