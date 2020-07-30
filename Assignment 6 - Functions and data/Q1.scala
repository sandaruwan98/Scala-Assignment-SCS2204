object Main extends App {
  class Rational(x: Int, y: Int) {
    def num = x
    def denom = y
    def neg = new Rational(-this.num, this.denom)

    override def toString() = (num + "/" + denom)
  }

  val r = new Rational(3, 5)
  println(r.neg.toString())
}
