object task3 {
  import scala.io.StdIn

  def main(args: Array[String]): Unit = {

    var balance = 20000

    def checkBalance(): Unit = {
      println(s"Current balance is: $$balance")
    }

    def deposit(): Unit = {
      println("Enter the amount to deposit:")
      val d1 = StdIn.readInt()
      if (d1 < 0) {
        println("Please enter a positive amount.")
      } else {
        balance += d1
        println(s"New balance is: $$balance")
      }
    }

    def withdraw(): Unit = {
      println("Enter the amount to withdraw:")
      val d2 = StdIn.readInt()
      if (d2 > balance) {
        println("Insufficient balance.")
      } else {
        balance -= d2
        println(s"New balance is: $$balance")
      }
    }

    var flag = true
    while (flag) {
      println("Welcome. Choose an option:")
      println("1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit")
      val x1 = StdIn.readInt()
      x1 match {
        case 1 => checkBalance()
        case 2 => deposit()
        case 3 => withdraw()
        case 4 =>
          println("Exiting..")
          flag = false
        case _ =>
          println("Wrong Input... aborting ")
          flag = false
      }
    }
  }
}
