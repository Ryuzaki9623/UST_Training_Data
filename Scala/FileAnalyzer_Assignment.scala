import scala.io.Source

class FileAnalyzer(filePath: String) {
  private var lines: List[String] = List()
  private var words: List[String] = List()
  private var characters: List[Char] = List()

  def loadFile(): Unit = {
    val source = Source.fromFile(filePath)
    lines = source.getLines().toList
    source.close()
    words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    characters = lines.flatMap(_.toCharArray)
  }

  def wordCount(): Int = words.length

  def lineCount(): Int = lines.length

  def characterCount(): Int = characters.length

  def averageWordLength(): Double = {
    val totalWords = words.length
    val totalChars = words.map(_.length).sum
    if (totalWords > 0) totalChars.toDouble / totalWords else 0.0
  }

  def mostCommonStartingLetter(): Option[Char] = {
    if (words.isEmpty) None
    else {
      val startingLetters = words.map(_.head)
      Some(startingLetters.groupBy(identity).maxBy(_._2.size)._1)
    }
  }

  def wordOccurrences(word: String): Int = words.count(_ == word.toLowerCase)
}

object FileAnalysis {
  def main(args: Array[String]): Unit = {
    val filepath = "C:\\Users\\Administrator\\IdeaProjects\\file1\\src\\main\\scala\\mughals"
    val analyzer = new FileAnalyzer(filepath)
    analyzer.loadFile()

    println(s"Word Count: ${analyzer.wordCount()}")
    println(s"Line Count: ${analyzer.lineCount()}")
    println(s"Character Count: ${analyzer.characterCount()}")
    println(f"Average Word Length: ${analyzer.averageWordLength()}%.2f")
    println(s"Occurrences of 'mughal': ${analyzer.wordOccurrences("mughal")}")
    //println(s"Most Common Starting Letter: ${analyzer.mostCommonStartingLetter().getOrElse("None")}")

  }
}
