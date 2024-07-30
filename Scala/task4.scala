import scala.io.StdIn, scala.io.Source
import scala.util.Using
object task4{
  def main(args: Array[String]): Unit = {

    val filepath = "C:\\Users\\Administrator\\IdeaProjects\\file1\\src\\main\\scala\\IndiaData.csv"
    val source = Source.fromFile(filepath)

    // Read all lines from the file
    val lines = source.getLines().drop(1).toList // drop(1) skips the header
    // Split each line by comma and convert to a list of lists
    val data = lines.map(line => line.split(",").toList)
    source.close()

    //data.foreach(println)

    // 1 state with highest gdp
    val highGdpState = data.maxBy(row => row(1).toDouble)
    print("Highest Gdp state= ", highGdpState(0))
    //println(highGdpState(0))

    // 2 avg gdp per capita
    val totalPercapita = data.map(row => row(2).toInt).sum
    val totalCount = data.size
    val avgPercapita = (totalPercapita /totalCount)
    print("Avg Gdp per capita= ", avgPercapita)
    
    // 3 total gdp
    val totalGDP = data.map(row => row(1).toDouble).sum
    print("Total GDP= ",totalGDP)
    
  }
}