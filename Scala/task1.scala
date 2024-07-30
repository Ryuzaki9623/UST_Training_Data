//Task: Record = [product_name, unit_price, discount, quantity]
//Filter out products that have price > 50
//calculate total cost of each product in
//print the name of products that has exceeded total cost > 300

object task1 {
  def main(args: Array[String]): Unit = {
    // Define the records
    val records = List(
      List("Prod1", 20, 0, 8),
      List("Prod2", 60, 3, 5),
      List("Prod3", 30, 6, 7),
      List("Prod4", 70, 10, 5),
      List("Prod5", 80, 15, 4)
    )

    // Filter out products with a unit price > 50
    val filteredRecords = records.filter(record => record(1).asInstanceOf[Int] <= 50)

    // Calculate total cost and print product names with total cost > 300
    for (record <- filteredRecords) {
      val productName = record(0).asInstanceOf[String]
      val unitPrice = record(1).asInstanceOf[Int]
      val discount = record(2).asInstanceOf[Int]
      val quantity = record(3).asInstanceOf[Int]
      val totalCost = (unitPrice - discount) * quantity

      if (totalCost > 300) {
        println(productName)
      }
    }
  }
}


