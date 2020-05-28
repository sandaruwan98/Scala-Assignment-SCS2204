import scala.io.StdIn._

object TemperatureConvert extends App {

  println(
    "Temperature in 'F : " + convertToFahrenheit(
      readLine("Enter temperature in 'C : ").toDouble
    )
  );
 
  def convertToFahrenheit(t: Double): Double = t * 1.8000 + 32.00;
 

}
