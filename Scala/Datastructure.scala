object Datastructure {
  def main(args: Array[String]): Unit = {
    //list of string
    val fruit: List[String] = List("apple", "mango", "orange", "pineapple")
    val a=6
//    println("first element: " + fruit.head)
//    print(fruit(2))
//    println("last array: " + fruit.tail)
//    println("last element: " + fruit.last)
//    println(fruit.getClass)
//    println(a)
//    println(a.getClass)

    //empty list
    val List2: List[Nothing] = List()
//    print(List2)

//  list declaration (another way)
    val List3= 10::20::30::40::50::Nil
    println(List3)

//list Buffer of type Mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Palakkad"
    cities += ("Thrissur", "Ernakulam", "Tvpm")
    cities -= "Thrissur"
    println(cities)


    //array is mutable, fixed size collection of data structure , homogenous

    var array1 = Array("apple", "mango", "orange", "pineapple")

//    array1.foreach(println)             //print in multiline

//    println(array1.mkString(","))       //print in single line. comma ',' is delimiter, we can also use any other character also

    array1(0)="Banana"                  //update

//    println(array1.mkString(","))


    // declare an empty array
    val arr_1 = new Array[String](10)   //1D array

    val arr_2 = Array.ofDim[Int](2,2)   //2D array
    arr_2(0)(0) = 123
    arr_2(0)(1) = 234
    arr_2(1)(0) = 345
    arr_2(1)(1) = 456
    //printing array: array is in 2d, we need to flatten it first and then print

    val flattenArr : Array[Int]  = arr_2.flatten
    println(flattenArr.mkString(","))

//  Set Collection - immutable,
//  HashSet - mutable
    val set_1 : Set[String] = Set()         //one way of doing
    val set_2 = Set( "mango", "orange", "pineapple", "apple", "banana") // alternate way of doing
    println(set_2)

    import scala.collection.mutable.Set
    val mutableSet = Set( "mango", "orange", "pineapple", "apple", "banana")
    mutableSet += ("strawberry")
    mutableSet -= ("mango")

//  Tuples - fixed size, can hold multiple tuples, immutable
    val Tuple1 = (20,40,60,80,100)  //indexing start from 1, not 0
    //Tuple1._1 = 10 //error, tuples cannot be update like this
    println(Tuple1._2)

// Map- key-value pairs, each key unique, van multipkr ng
    var MapVar:Map [String, Int]=Map()

//    var MapVar1: Map[String,Int] = Map("A"-> 1,"B"-> 2,"C"-> 3)
//    println(MapVar1.contains("C"))
//    println(MapVar1.get("B"))
//    println(MapVar1.keys)   //keys
//    println(MapVar1.values)   //values

    import scala.collection.mutable.Map
    var mut_Var: Map[String, Int] = Map("A" -> 1, "B" -> 2, "C" -> 3)
    mut_Var("A")=10
    mut_Var += ("D" -> 6)
    mut_Var -= ("B")
    println(mut_Var)

//  Iterators in scala programming- represents a seq of elements, allows
//  you to traverse through a collection of sequence

   val mylist = List(2,3,4,5,6,7,8,9)
   val iter = mylist.iterator
// methods of iterator to check if there is more element : .hasNext()
// .next() to retrieve next value
// .remove() to remove elements from mutable iterators

    println(iter.next())
    println(iter.next())
    println(iter.next())
  }
// lazy initialise
  lazy val  donuts: Int=100
  println(donuts *  3)
}