import scala.collection.mutable

object GroupSameNumRepeatedChars {

  def groupCharacters(sentence: String): Map[Int, List[Char]] = {
    // Create a mutable map to store characters with their frequencies
    val charFrequency = mutable.Map[Char, List[Char]]().withDefaultValue(List.empty)

    // Remove spaces from the sentence
    val sanitizedSentence = sentence.replaceAll(" ", "")

    // Count the frequency of each character
    for (char <- sanitizedSentence) {
      // Append the current character to its frequency list in the map
      charFrequency(char) = char :: charFrequency(char)
    }

    // Create a mutable map to store characters grouped by their frequencies
    val groupedCharacters = mutable.Map[Int, List[Char]]().withDefaultValue(List.empty)

    // Group characters with the same frequency
    for ((char, chars) <- charFrequency) {
      val freq = chars.length
      // Concatenate the characters to the existing list for the corresponding frequency
      groupedCharacters(freq) = chars ::: groupedCharacters(freq)
    }

    // Convert the mutable map to an immutable map and return
    groupedCharacters.toMap
  }

  def main(args: Array[String]): Unit = {
    val sentence = "Sir Percy Blakeney was an English aristocrat who risked his life to rescue French noblemen from the guillotine during the French Revolution."
    val groupedCharacters = groupCharacters(sentence)
    println(groupedCharacters)
  }


}
