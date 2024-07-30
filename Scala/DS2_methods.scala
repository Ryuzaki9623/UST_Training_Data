object DS2_methods {
  def main(args: Array[String]): Unit = {
    //Lists and methods
    val list_1 = List("Apple", "Banana", "Cherry", "Donuts", "Eclairs")

    //val list_2 = List() //empty list
    //basic operations
    val first_element = list_1.head
    val restof_element = list_1.tail
    val last_element = list_1.last

    val sec_ele = list_1(2) //2nd element
//    print(sec_ele)
//    println(list_2.isEmpty)  // check list is empty (boolean op)
//    println(list_1.isEmpty)

    val len1 = list_1.length
    val list_2 = List(1, 5, 8, 6, 2)
    val list_3 = 0 :: list_2 // adding to the first

    // println(list_3)
    val appendList = list_3 :+ 8 // adding to last
    // println(appendList)

    //concatenate
    val concat_list = list_3 ::: List(8, 9, 10, 11, 12)
    val concat_list2 = list_3 ++ List(8, 9, 10, 11, 12)

//    println(concat_list2)
//    println(concat_list)

    //Removing or dropping values
    println(concat_list2)
//    println(concat_list2.drop(3))  // drop 3 elements from the beginning
    println(concat_list2.filter(_ != 5))  // filtering by value on boolean condition
    println(concat_list2.filter(_ > 5))
    println(concat_list2.filter(_ %2 == 0))

    println(concat_list2.diff(List(1,3,6,8)))  //removes the values

//    transforming list
    println(list_2.map(_ *2))

    val list_4 = List(List(1, 2), List(4, 5), List(6, 7))
    val list_5 = list_4.flatMap(identity)
    println(list_5)

    val sum = list_5.reduce(_ + _)
    val mul = list_5.reduce(_ * _)
    println(sum)
    println(mul)

    // slicing and subset of list
    print(list_5.take(4))  //first 4 elements
    print(list_5.takeRight(4)) // last 4 elements
    print(list_5.dropRight(3)) // last 3 elements will be removed
    print(list_2)
    print(list_2.slice(1,4))

    // converting list to map:- we need list of tuples
    val listofTuples = List(("UST1", "Shiva"), ("UST2", "Shas"), ("USt3", "Affan"))
    // print(listofTuples.toMap)

    //zipping and unzipping
    val zippedList = list_1.zip(list_2)
    //println(zippedList)
    val (abc, pqr) = zippedList.unzip
    //println(abc)
    //println(pqr)


    ///////////////////////////////////////
    //  Sets
    val set1 = Set(1, 2, 3, 4, 5, 6, 7, 8)
    val set2 = Set("Apple", "Banana", "Cherry", "Donuts", "Eclairs")

    //println(set1)

    //println(set1.contains(9))
    //println(set1.contains(5))

    set1 + 9
    set1 - 7
    //println(set1)

    val setA = Set(10, 20, 30, 40, 50)
    val setB = Set(30, 40, 50, 60, 70)

    val uniSet = setA union setB
    //println(uniSet)
    val int_Set = setA intersect setB
    //println(int_Set)
    setA diff setB
    setB diff setA
    setA.subsetOf(setB)

    //mapping,filter,reduce, for each and display all elements:

    val newmap = setA.map(_ * 2)
    val newmap2 = setA.reduce(_ + _)
    val newmap3 = setA.filter(_ % 2 == 0)

    //println(newmap)
    //println(newmap2)
    //println(newmap3)

    ///////////////////////////////////////
    // Array
    val array1 = Array("A", "B", "C", "D", "E", "F", "G")
    val array2 = Array(1, 2, 3, 4, 5, 6, 7)

    val emptyArr = Array[Int]()
    array2(0) = 10
    // array2 += 9     error here
    //Arrays in Scala are fixed - size
    //so you cannot append an element directly to an array using +=
    //but instead we can use ArrayBuffer
    import scala.collection.mutable.ArrayBuffer
    val array3 = ArrayBuffer(1, 2, 3, 4, 5, 6, 7)
    array3 += 9
    array3 -= 3
    array3.map(_ * 2)
    val array4 = array3.toArray
    //println(array3)
    //println(array4)

    //Nested Array
    val nestedArray = Array(Array(1, 2, 3), Array(4, 5, 6, 7), Array(8, 9))
    val flatArray = nestedArray.flatten
    //println(flatArray)
    //println(flatArray.slice(1,5))
    val array5 = Array(30, 10, 50, 20, 40)
    //println(array5.sorted.mkString(","))
    //println(array4.reverse.mkString(" "))

    //groupBy
    var array6 = Array("Abc", "Bnno", "AeofC", "Dog", "Ele", "Eppq", "AbepG")
    var groupByLen = array6.groupBy(_.length)
    var groupByChar = array6.groupBy(_.charAt(0))
    var oddEven = flatArray.groupBy(num => if (num % 2 == 0) "even" else "odd")

    //println(groupByLen.map { case (k, v) => s"$k: ${v.mkString(", ")}" }.mkString("\n"))
    //println(groupByChar.map { case (k, v) => s"$k: ${v.mkString(", ")}" }.mkString("\n"))
    //oddEven.foreach({ case(key,value) => println(s" $key: ${value.mkString(", ")}")

//    import scala.io.StdIn
//    println("Enter the number: ")
//    var x1 = StdIn.readLine().toInt
//
//    val array7 = ArrayBuffer[String]()
//    for (_ <- 0 until x1) {
//      val strn = StdIn.readLine().toString
//      array7 += strn
//    }
//    println(array7.mkString(" "))
//
//    def isVowel(c: Char): Boolean = "AEIOUaeiou".contains(c)
//    val groupByVowel = array7.groupBy(str => if (isVowel(str.charAt(0))) "vowel" else "consonant")
//    groupByVowel.foreach { case (key, values) => println(s"$key: ${values.mkString(", ")}")}

////////////////////////////////////////////////////
    // Collection Map
    import scala.collection.mutable
    val immutableMap = Map("a" ->1, "b" -> 2, "c" -> 3,"d" -> 4,"e" -> 5)
    val mutableMap = mutable.Map("a" ->1, "b" -> 2, "c" -> 3,"d" -> 4,"e" -> 5)

    println(immutableMap.contains("a"))
    println(immutableMap("a"))

    val MapA = Map("a" ->1, "b" -> 2, "c" -> 3)
    val MapB = Map("c" -> 10,"d" -> 4,"e" -> 5, "f" -> 6, "g" -> 7)

    val mergedMap = MapA ++ MapB
    println(mergedMap)

    // transforming keys and values
    val incrementValue = immutableMap.view.mapValues(_ + 1)
    incrementValue.foreach{ case (k,v) => println(s"$k -> $v")}

    val transformKey = immutableMap.map{case (k,v) => (k.toUpperCase,v)}
    transformKey.foreach{ case (k,v) => println(s"$k -> $v")}

  }
}