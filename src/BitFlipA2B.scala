object BitFlipA2B {

  def bitFlipCount(a: Int, b: Int): Int = {
    var count = 0                // Initialize a variable to keep track of the flip count
    var xor = a ^ b              // Calculate the bitwise difference between a and b using XOR
    println(xor)

    while (xor != 0) {           // Continue the loop until all differing bits have been accounted for
      count += xor & 1           // Increment the count if the least significant bit is set (equals 1)
      xor >>= 1                  // Right-shift the XOR result by 1 bit position to process the next bit
    }

    count                        // Return the total number of bits that needed to be flipped
  }


  def main(args: Array[String]): Unit = {
    println(bitFlipCount(29, 15))
  }

}
