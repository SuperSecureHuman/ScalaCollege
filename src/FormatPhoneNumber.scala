object FormatPhoneNumber {

  // Function that takes a ten-digit number as an integer and prints it as a proper phone number
  def printPhoneNumber(number: String): Unit = {
    val numberString = number  //number.toString

    // Check if the input number has exactly ten digits
    if (numberString.length != 10) {
      println("Invalid phone number.")
      return
    }

    val areaCode = "+91"
    val exchange = numberString.substring(0, 3)
    val station = numberString.substring(3, 6)
    val lineNumber = numberString.substring(6)

    // Print the phone number in the proper format
    println(s"$areaCode ($exchange) $station-$lineNumber")
  }

  def main(args: Array[String]): Unit = {
    // Test the function
    //Phonenumber data type is long
    val phoneNumber = "9445687596"
    printPhoneNumber(phoneNumber)

  }

}
