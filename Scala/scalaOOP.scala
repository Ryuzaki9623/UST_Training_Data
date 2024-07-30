// defining class
class Car (var make: String, var model:String, var year:Int){
  def displayInfo(): Unit = {
    println(s"car info: $year $make $model")
  }
}
object simpleClass extends App {
  val car = new Car("Toyota","LC",2016)
  car.displayInfo()
  
  //modifying object
  car.make = "Honda"
  car.model ="Accord"
  car.year = 2020
  car.displayInfo()
}