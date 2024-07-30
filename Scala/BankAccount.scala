class Account(val accountNum: String, var balance: Double) {
  def deposit(amount: Double) : Unit = {
    if (amount > 0){
      balance += amount
      println(s"Amount credited, new Balance: $balance")
    }
  }

  def withdraw(amount: Double) : Unit = {
    if (amount > 0 && amount <= balance){
      balance -= amount
      println(s"Withdraw $amount, new Balance : $balance")
    } else {
      println("Invalid Amount")
    }
  }
  def getBalance : Double = balance
}

object BankingApp {
  def main(args: Array[String]): Unit ={
    val acc1 = new Account("UST11",10000)
    val acc2 = new Account("UST12",14000)
    val acc3 = new Account("UST13",16500)
    val acc4 = new Account("UST14",12100)

    println(s"Account Num: ${acc1.accountNum}, Balance: ${acc1.balance}")
    println(s"Account Num: ${acc2.accountNum}, Balance: ${acc2.balance}")
    println(s"Account Num: ${acc3.accountNum}, Balance: ${acc3.balance}")
    println(s"Account Num: ${acc4.accountNum}, Balance: ${acc4.balance}")

    acc1.deposit(15000)
    acc1.withdraw(12000)
    print(s"final balance: ${acc1.balance}" )

  }


}