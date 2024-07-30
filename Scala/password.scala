object password
{
  import scala.io.StdIn
  import scala.util.Random
  def main (args: Array[String]): Unit=
  {
    println("\t\tPassword Generator")
    println("Enter a length:- ")
    val ln =StdIn.readInt()
    val password = makePass(ln)
    println(s"Generated password is: $password")
  }
  def makePass(leng: Int): String = {
    val allCharacters = "!@#$%^&*()|;:?`~ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"
    val random = new Random
    val password = new StringBuilder(leng)
    for (_ <- 1 to leng) {
      val randomChar = allCharacters(random.nextInt(allCharacters.length))
      password.append(randomChar)
    }
    password.toString()
  }
}