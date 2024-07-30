object workflow {
  def main(args: Array[String]): Unit = {
//    1. Map
    val nums = List(1,2,3,4,5,6)
    val n2 = nums.map(_ + "Number")
    //print(n2)
    //n2.foreach(println)
    val city = List("Delhi", "Kochi", "Munnar", "Mumbai", "Palakkad", "TVM")
    //print(city.map(_.length))

//    2. Flatmap
    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8))
    val flatList = nestedList.flatMap(identity)
    //flatList.foreach(println)

    val sentance = List("Hi there","My name is Affan", "Nice to meet you", "What is your name?")
    val words = sentance.flatMap(_.split(" "))
    //words.foreach(println)

//    3. Filter - selects elements from collection that will satisfy a condition

    val shortWords = words.filter(_.length <=3)
    //shortWords.foreach(println)


//    4. Fold - is similar to reduce function starting with a initial value

    val numNew= nums.fold(0)(_ + _) //0 is the initial value,
    //print(numNew)

//    5. Reduce - combines elements of collections but does not require initial position

    val words2 = List("Hi", "there", "My", "name", "is", "Affan")
    val combi = words2.reduce(_ + " " + _)
    //println(combi)

//    6. Foreach - applies a given procedure to each element of a collection

    //words2.foreach( i => println(i.toUpperCase))

//    7. Collect - applies to partial function to the elements of collection and returning a new collection

    val num1 = List(1,2,3,4,5,6,7,8,9,10)
    val newNum = num1.collect{case x if x % 2 != 0 => x }
    //print(newNum)

    val largeWords = words2.collect{case y if y.length >= 5 => y}
    //println(largeWords)

//    8. Partition - split based on predicate

    val (longWord, shortWord) = words2.partition(_.length >4)
    //println(longWord)
    //println(shortWord)


//    9. Group by - groups a collection based on a given function

    val num2 = List(11,12,13,14,15,16,17,18,19,20)
    //println(num2.groupBy(_ %3 ))


//    10. Scan - similar to fold but it returns a collection of successive results of binary operation

    val cum_sum = num2.scan(0)(_+_)  // 0 is the starting or initial value
    print(cum_sum)

  }
}