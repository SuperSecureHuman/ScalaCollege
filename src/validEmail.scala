object validEmail {

  def isValidEmail(email: String): Boolean = {
    val atIndex = email.indexOf("@")
    val dotIndex = email.lastIndexOf(".")


    if (atIndex <= 0 || dotIndex <= atIndex + 1 || dotIndex >= email.length - 1) {
      return false
    }

    val localPart = email.substring(0, atIndex)
    val domainPart = email.substring(atIndex + 1, dotIndex)


    if (localPart.isEmpty || domainPart.isEmpty) {
      return false
    }

    val validChars = ('A' to 'Z') ++ ('a' to 'z') ++ ('0' to '9') :+ '_' // Include underscore
    val localPartValid = localPart.forall(validChars.contains)


    val domainValidChars = ('A' to 'Z') ++ ('a' to 'z') ++ ('0' to '9') :+ '.' // Include dot
    val domainPartValid = domainPart.forall(domainValidChars.contains)

    localPartValid && domainPartValid
  }

  def main(args: Array[String]) : Unit = {

  // Example usage
  val email1 = "xx_xxx@cb.amrita.edu"
  val email2 = "x.xxx@am.amrita.edu"
  val email3 = "xxxx@blr.amrita.edu"
  val email4 = "invalid.email"

  println(isValidEmail(email1)) // true
  println(isValidEmail(email2)) // true
  println(isValidEmail(email3)) // true
  println(isValidEmail(email4)) // false

  }


}
