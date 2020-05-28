object Salary extends App {

  println("The take home salary of an employee : " + take_home_salary())
  
  def take_home_salary(): Double =
    salary_without_tax() - tax(salary_without_tax());
  def salary_without_tax(): Double = 150 * 40 + 75 * 20;

  def tax(amount: Double): Double = amount * 0.1;

}
