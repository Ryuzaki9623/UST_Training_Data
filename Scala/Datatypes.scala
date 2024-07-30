/*
singleton instance that is lazily initialised
when it is first accessed, it is similar to class but only one instance
will be created automatically

main is the entry point
Unit defines the return type of 'main' indicating that it returns nothing
*/

object Datatypes
{
  def main (args: Array[String]): Unit=
    {
      //integer
      val intNum: Int = 20
      val longNum: Long = 22723468L
      val shortNum: Short = 2413
      val byteNum: Byte = 123

      //floating
      val flNum: Float = 3.14f
      val doubleNum: Double = 3.4126512

      //string
      val strVar: String = "Hello Scala"
      val charVar: Char = 'A'

      //Unit Datatype
      val unitValue: Unit = ()

      //Mutable DataTypes
      var boolvar1: Boolean = true
      var boolvar2: Boolean = false

      //printing
//      println(s"Integer :$intNum")
//      println(s"$byteNum")
//      println(s"$shortNum")
//      println(s"$longNum")
//      println(s"$flNum")
//      println(s"$doubleNum")
//      println(s"$strVar")
//      println(s"$charVar")
//      println(s"$unitValue")

      print(strVar)
      var intVar: Int=3333
      print("Integer variable: "+ intVar)
      intVar= intVar+2034                 //item updating
      println("Integer variable: "+ intVar)
      print(intNum)

      print("updates",intVar)
      print("updates"+s"$intVar")
    }

}