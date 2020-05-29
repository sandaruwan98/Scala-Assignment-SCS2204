import scala.io.StdIn._

object PrimeNum extends App {

  if (prime(readLine("Enter Number : ").toInt)) printf("Number is prime")
  else printf("Number is not prime")

  def prime(prm: Int, n: Int = 2): Boolean = n match {
    case x if (prm == 1)        => false
    case x if (x == prm)        => true
    case x if (gcd(prm, x) > 1) => false
    case x                      => prime(prm, x + 1)
  }

  def gcd(p: Int, q: Int): Int = q match {
    case 0            => p
    case x if (x > p) => gcd(x, p)
    case x            => gcd(x, p % x)
  }
  
}
