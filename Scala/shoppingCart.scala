import scala.collection.mutable.Map

case class Item(name: String, var quantity: Int, price: Double, category: String)

class Payment {
  def processPayment(amount: Double, paymentMethod: String): String = {
    paymentMethod match {
      case "Credit Card" | "Debit Card" | "UPI" =>
        s"Payment of ₹${amount} processed successfully using $paymentMethod."
      case _ =>
        s"Payment method $paymentMethod not supported."
    }
  }
}

class ShoppingCart() {
  var items = Map[String, Item]()
  val GST_RATE = 0.05
  val Threshold = 200.0
  val Delivery_charge = 30.0

  def add(item: Item): Unit = {
    if (item.quantity <= 0 || item.price < 0) {
      println("Quantity must be greater than zero and price cannot be negative.")
    } else if (items.contains(item.name)) {
      println("Item is already in your cart... Use update to change Quantity")
    } else {
      items += (item.name -> item)
      println("Added Successfully")
    }
  }

  def updateItem(name: String, quantity: Int): Unit = {
    if (quantity < 0) {
      println("Quantity cannot be negative.")
    } else if (items.contains(name)) {
      if (quantity == 0) {
        items.remove(name)
        println("Item removed from the cart as quantity is set to zero.")
      } else {
        items(name).quantity = quantity
        println("Quantity updated successfully.")
      }
    } else {
      println("Item is not present in the cart.")
    }
  }

  def viewCart(): Unit = {
    if (items.isEmpty) {
      println("Empty Cart")
    } else {
      items.values.foreach { item =>
        println(s"${item.name} => quantity: ${item.quantity} => total: ${item.quantity * item.price} (without GST)")
      }
    }
  }

  def removeItem(name: String): Unit = {
    if (items.contains(name)) {
      items.remove(name)
      println(s"Removed $name from the cart.")
    } else {
      println("Cart doesn't contain this item.")
    }
  }

  def totPrice(): Double = {
    if (items.isEmpty) {
      println("Cart is Empty")
      0.0
    } else {
      val total_price = items.map(item => item._2.quantity * item._2.price).sum
      val gst = total_price * GST_RATE
      val totalWithGST = total_price + gst
      val finalTotal = if (totalWithGST < Threshold) totalWithGST + Delivery_charge else totalWithGST
      println(f"Cart Value:\t\t₹${total_price}%.2f")
      if (totalWithGST < Threshold) {
        println(f"Delivery Charge:\t₹${Delivery_charge}%.2f")
      }
      println(f"GST:\t\t\t₹${gst}%.2f")
      println(f"Amount Payable:\t\t₹${finalTotal}%.2f")
      finalTotal
    }
  }
}

object ShoppingCartApp extends App {
  val cart = new ShoppingCart()
  val paymentGateway = new Payment()

  var go = true

  while (go) {
    println(
      """
        Options
        ------------
        1. Add item
        2. Update Cart
        3. View Cart
        4. Remove item
        5. Calculate Total Price
        6. Payment
        7. Exit
      """
    )
    val option = scala.io.StdIn.readInt()

    option match {
      case 1 =>
        println("Enter item name: ")
        val name = scala.io.StdIn.readLine()

        println("Enter quantity: ")
        val quantity = scala.io.StdIn.readInt()

        println("Enter price: ")
        val price = scala.io.StdIn.readDouble()

        println("Enter category: ")
        val category = scala.io.StdIn.readLine()

        cart.add(Item(name.toLowerCase(), quantity, price, category.toLowerCase()))

      case 2 =>
        println("Enter item name to update: ")
        val name = scala.io.StdIn.readLine()

        println("Enter new quantity: ")
        val quantity = scala.io.StdIn.readInt()

        cart.updateItem(name.toLowerCase(), quantity)

      case 3 =>
        cart.viewCart()

      case 4 =>
        println("Enter item name to remove: ")
        val name = scala.io.StdIn.readLine()
        cart.removeItem(name.toLowerCase())

      case 5 =>
        cart.totPrice()

      case 6 =>
        println("Choose a payment method (Credit Card/Debit Card/UPI): ")
        val paymentMethod = scala.io.StdIn.readLine()
        val amount = cart.totPrice()
        if (amount > 0) {
          println(paymentGateway.processPayment(amount, paymentMethod))
        } else {
          println("Cannot proceed to payment. The cart is empty or an error occurred.")
        }

      case 7 =>
        go = false
        println("Exiting...")

      case _ =>
        println("Invalid option, please try again.")
    }
  }
}