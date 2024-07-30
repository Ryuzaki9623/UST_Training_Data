//inheritance
//mainclass
class Animal (val name: String ) {
  def makeSound(): Unit = {
    println(s"$name is making a sound")
  }
}

//subclass
class Dog (name: String) extends Animal(name) {
  override def makeSound(): Unit = {
    print(s"$name says Bow Bow")
  }
}

object obj1 extends App {
  val animal = new Animal("Tuttu ")
  animal.makeSound()

  val dog = new Dog("Charlie")
  dog.makeSound()
}