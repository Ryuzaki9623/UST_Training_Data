class Circle (val radius: Double) {
  def area: Double = Math.PI * Math.pow(radius,2)
  def circumference: Double = Math.PI * 2 * radius
}

// companion object will have same name as of class or trait name, 
// or same scope it resides within same file.
// can be used access to private members of the class or trait

object circle1 {
  def apply(radius: Double) : Circle = new Circle (radius)
}

object companionObj extends App {
  val circle = Circle(6.0)
  println(f"${circle.area}%.2f")
  println(f"${circle.circumference}%.2f")
}