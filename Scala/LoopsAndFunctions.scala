object LoopsAndFunctions {
  def main(args: Array[String]): Unit = {
    /*

    // do-while loop
    var j =1
    while {
      println(j)
      j+=1
      j<=5
    } do()


    // for loop with range and step
    for (i <-1 to 10 by 2){
      println(i)
    }




   // iterating over collection
   val fruits = List("a","b","c","d","e")
   for (i <- fruits ){
      println(i)
    }

    import scala.io.StdIn
    print("Enter Temperature: ")
    val temp = StdIn.readInt()
    print("Enter Humidity: ")
    val hum = StdIn.readInt()

    val weatherDesc = if (temp > 30 & hum > 60) {
      "It is hot and Humid"
    } else if (temp > 30) {
      "It is hot"
    } else if (hum > 60) {
      "It is humid"
    } else {
      "pleasant"
    }
    print(weatherDesc)


    def add (a: Int, b: Int) : Int = {
       a+b
    }
    println(add(8,4))

    val summ = (a: Int, b:Int) => a+b
    println(summ(6,9))


  //prob to create func to find max element in a list
  def findMax (lst : List[Int]) : Int = {
    lst.max
  }
  val nums = List(23,14,35,46,21)
  val maxNum = findMax(nums)
  println(maxNum)
*/
  ///////////////////////
  def fact(num: Int) : Int = {
    if (num ==0) 1
    else num * fact(num-1)
  }
    println(fact(5))


  }
}
