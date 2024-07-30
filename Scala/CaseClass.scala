//case class are special classes in scala that are immutable and are 
// compared by value. they are ideal for use in pattern matching

case class Person(name: String, salary: Int)
  object CaseClass extends App{
    // create an instance of case class
    val person1 = Person("Person1",3000)
    val person2 = Person("Person2",5000)

    // print the person details
    println(person1)
    println(person2)

    val person3 = person1.copy(name = "Person3")
    println(person3)

    //pattern matching with case class
    //pattern matching in scala allows you to match values against-
    // -pattern and execute code based on the match
    person1 match {
      case Person(name,salary) => println(s"Name: $name, Salary: $salary")
    }
}