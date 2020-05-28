
object BestTicketPrice extends App {

  println("Profit when price is 15.00 : " + profit(15, 120))
  println("Profit when price is 10.00 : " + profit(10, 140))
  println("Profit when price is 20.00 : " + profit(20, 100))

  def cost(att: Double): Double = 5 + 3 * att;
  def income(price: Double, att: Double): Double = att * price;

  def profit(price: Double, att: Double): Double =
    income(price, att) - cost(att);
 
}
