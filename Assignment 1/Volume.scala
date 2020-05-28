import scala.io.StdIn._
import scala.math

object Volume extends App {

  println(
    "The volume of a sphere : " + VolumeOfSphere(
      readLine("Enter radius : ").toDouble
    )
  );

  def VolumeOfSphere(r: Double): Double = (4.0 / 3.0) * math.Pi * r * r * r;

}
