import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
object  learn1{
  scala.io.StdIn
  def main (args: Array[String]): Unit=
  {
//    println("enter two numbers")
//    var a = StdIn.readInt()
//    var b = StdIn.readInt()

//    var a = 10
//    while (a > 0) {
//      print(a + " ")
//      a = a - 1
//    }
    val ar1 = Array(10)
    val ar2 = Array('a','b','c')
    val p = ar2.mkString("")
    //print(p)
    val ls = List(7, 9, 2, 3, 10, 7, 9, 8, 3, 7, 4, 8, 10, 10, 7, 7, 2, 2, 3, 9, 1, 2, 9, 4, 6, 10, 4, 7, 10, 10, 2, 8, 3, 7, 8, 2)
    //print(ls.diff(List(2,7)))
    //println(ls.map(_ * 2))
    var c =0
    for (elem <- ls) {
      if (elem == 7){
        c = c+1
      }
    }
    //print("num of 7s is "+c)
    val ls2 = List(2,4,5,7,0,3,1,5,8,5,7)
    //val ls22 = ls2.map(_)
    //print(ls22)
    val m = StdIn.readInt()
    val ar = ArrayBuffer[String]()

    for (_ <- 0 until m){
      val s = StdIn.readLine()
      ar += s
    }
    print(ar.mkString(" "))

    //val nestedArray = Array(Array(1, 2, 3), Array(4, 5, 6, 7), Array(8, 9))
    //val flatArray = nestedArray.flatten
    //print(flatArray.mkString(""))

  }
}