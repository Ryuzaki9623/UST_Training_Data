import scala.io.StdIn, scala.io.Source

object FileProcessing_Assignment {
  def main(args: Array[String]): Unit = {

    val filepath = "C:\\Users\\Administrator\\IdeaProjects\\file1\\src\\main\\scala\\mughals"
    val source = Source.fromFile(filepath)

    println("Enter a limit:- ")
    val ln = StdIn.readInt()

    val lines = source.getLines().toList  // read all the files
    source.close()                        // closing read

    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase())
    val groupedWords = words.groupBy(identity)
    val wordCount = groupedWords.mapValues(_.size).toSeq.sortBy(-_._2)
    wordCount.take(ln).foreach{case (word,count) => println(s"$word- $count")}

  }
}