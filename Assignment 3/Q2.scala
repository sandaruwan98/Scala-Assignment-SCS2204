import scala.io.StdIn._

object PrimeSequence extends App {

  def gcd(p: Int, q: Int): Int = q match {
    case 0            => p
    case x if (x > p) => gcd(x, p)
    case x            => gcd(x, p % x)
  }

  def prime(prm: Int, n: Int = 2): Boolean = n match {
    case x if (prm == 1)        => false
    case x if (x == prm)        => true
    case x if (gcd(prm, x) > 1) => false
    case x                      => prime(prm, x + 1)
  }

  def primeSeq(n: Int): Unit = {
    if (n > 0) primeSeq(n - 1) else print("Prime Sequnce : ")
    if (prime(n)) {
      print(n)
      print(" ")
    }

  }

  primeSeq(readLine("Enter Number : ").toInt)
}
