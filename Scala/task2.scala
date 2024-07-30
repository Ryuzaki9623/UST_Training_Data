object task2 {
  def main(args: Array[String]): Unit = {

    import scala.collection.mutable.ArrayBuffer
    import scala.io.StdIn
    println("Enter the number: ")
    var x1 = StdIn.readLine().toInt

    val array7 = ArrayBuffer[String]()
    for (_ <- 0 until x1) {
      val strn = StdIn.readLine().toString
      array7 += strn
    }
    println(array7.mkString(" "))
    val vowels= Set('a','e','i','o','u')

    val groupByVowel = array7.groupBy(str =>
      if (vowels.contains(str(0).toLower)) "vowel" else "consonant")

    groupByVowel.foreach { case (key, values) =>
      println(s"$key: ${values.mkString(", ")}") }
  }
}