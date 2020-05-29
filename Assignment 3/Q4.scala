import scala.io.StdIn._

object OddOrEven extends App {

  if (isEven(readLine("Enter a number : ").toInt)) println("Number is Even")
  else println("Number is Odd")

  def isEven(x: Int): Boolean = x match {
    case 0 => true
    case _ => isOdd(x - 1)
  }

  def isOdd(x: Int): Boolean = !isEven(x)

}
