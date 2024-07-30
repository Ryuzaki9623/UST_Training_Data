object task3_2 {
  import scala.io.StdIn
  var balance = 20000

  def bankingMenu(): Unit = {
    var flag = true
    while (flag) {
      println("Welcome. Choose an option: ")
      println("1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit")
      var x1 = StdIn.readInt()
      if (x1 == 1) {
        checkbalance()
      } else if (x1 == 2) {
        deposit()
      } else if (x1 == 3) {
        withdraw()
      } else if (x1 == 4) {
        println("Exiting...")
        flag = false
      } else {
        println("Wrong Input... aborting")
        flag = false
      }
    }
  }

  def checkbalance(): Unit = {
    println(s"Current balance is: Rs $balance")
  }

  def deposit(): Unit = {
    println("Enter the amount to be deposited:")
    var d1 = StdIn.readInt()
    if (d1 < 0) {
      println("Enter a positive amount")
    } else {
      balance += d1
      println(s"New balance is: Rs $balance")
    }
  }

  def withdraw(): Unit = {
    println("Enter the amount to be withdrawn:")
    var d2 = StdIn.readInt()
    if (d2 > balance) {
      println("Insufficient balance")
    } else {
      balance -= d2
      println(s"New balance is: RS $balance")
    }
  }

  def main(args: Array[String]): Unit = {
    bankingMenu()
  }
}
