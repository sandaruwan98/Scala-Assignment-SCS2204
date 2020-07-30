object Main extends App {
  class Rational(x: Int, y: Int) {
    def num = x
    def denom = y
    def neg = new Rational(-this.num, this.denom)
    def +(r: Rational) =
      new Rational(
        this.num * r.denom + this.denom * r.num,
        this.denom * r.denom
      )

    def -(r: Rational) = this + r.neg
    override def toString() = (num + "/" + denom)
  }

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)
  val r = x - y - z
  println(r.toString())
}
