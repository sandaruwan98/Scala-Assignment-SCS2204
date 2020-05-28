import scala.io.StdIn._

object SumEven extends App {

  println("Addition of even numbers : " + sum(readLine("Enter number : ").toInt))

  
  def sum(n: Int): Int = n - 1 match {
    case -1                => 0
    case 0                 => 0
    case x if (x % 2 == 1) => sum(x)
    case x if (x % 2 == 0) => x + sum(x - 1)

  };

}
