import scala.io.StdIn, scala.io.Source
import scala.util.Using

object task5{
  def main(args: Array[String]): Unit = {

    val empData = List(("A",1000),("B",1500),("C",1300),("D",1500),("E",8000),
      ("F",1800),("G",6000),("H",2000),("I",6500),("J",1500),("K",7000))

    //empData.foreach(println)

    val total= empData.map(_._2).sum
    print("total sal=")
    println(total)

    val (high, low) = empData.partition(_._2 > 0.1*total)
    println("high=")
    println(high)
    println("low=")
    println(low)

  }
}