import scala.io.StdIn._

object AdditionOfnums extends App {

  println("Addition of numbers : " + sum(readLine("Enter number : ").toInt ))

  def sum(n: Int): Int = n match {
    case 0 => 0
    case _ => n + sum(n - 1)

  };

}
