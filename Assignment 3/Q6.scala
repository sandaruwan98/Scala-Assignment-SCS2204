import scala.io.StdIn._

object FibonacciSeq extends App {

  print_Fibonacci_seq(
    readLine("Enter number : ").toInt
  )

  def Fibonacci(x: Int): Int = x match {
    case 0 => 0
    case 1 => 1
    case _ => Fibonacci(x - 1) + Fibonacci(x - 2)
  };

  def print_Fibonacci_seq(x: Int): Unit = {

    if (x > 0) print_Fibonacci_seq(x - 1) else print("Fibonacci Sequnce : ");
    print(Fibonacci(x));
    print(" ")
  }

}
