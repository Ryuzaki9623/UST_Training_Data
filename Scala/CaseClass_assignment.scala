case class FullTime(name: String, salary: Int)
case class PartTime(name: String, salary: Int)
case class Contract(name: String, salary: Int)
case class Freelance(name: String, salary: Int)

object payroll extends App {
    def calculateSalary(employee: Any): Int = {
        employee match {
            case FullTime(_, salary) => salary
            case PartTime(_, salary) => salary
            case Contract(_, salary) => salary
            case Freelance(_, salary) => salary
        }
    }
    // Sample employees
    val val1 = FullTime("Dane", 5000)
    val val2 = PartTime("Smith", 2000)
    val val3 = Contract("Brown", 2500)
    val val4 = Freelance("White", 1500)
    val val5 = FullTime("John", 4000)
    val val6 = PartTime("Jane", 3000)

    // Calculate and print salaries
    println(s"${val1.name}'s salary: ${calculateSalary(val1)}")
    println(s"${val2.name}'s salary: ${calculateSalary(val2)}")
    println(s"${val3.name}'s salary: ${calculateSalary(val3)}")
    println(s"${val4.name}'s salary: ${calculateSalary(val4)}")
    println(s"${val5.name}'s salary: ${calculateSalary(val5)}")
    println(s"${val6.name}'s salary: ${calculateSalary(val6)}")
}
