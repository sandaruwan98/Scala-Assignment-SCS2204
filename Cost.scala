import scala.io.StdIn._

object Cost extends App {

  println(
    "The total wholesale cost : " + wholesaleCost(
      readLine("Enter how many copies : ").toInt
    )
  );


  def wholesaleCost(
      copies: Int,
      coverPrice: Double = 24.95,
      discount: Double = 0.4,
      shippingCostNormal: Double = 3.0,
      shippingCostAdditional: Double = 0.75
  ): Double =
    if (copies < 50) (coverPrice * (1 - discount) + shippingCostNormal) * copies
    else
      coverPrice * (1 - discount) * copies + shippingCostAdditional * (copies - 50) + shippingCostNormal * 50;
}
