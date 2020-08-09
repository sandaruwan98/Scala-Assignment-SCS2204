import scala.math

object Main extends App {
  case class Point(a: Int, b: Int) {
    def x: Int = a;
    def y: Int = b;

  }

  def add(p1: Point, p2: Point) = Point(p1.x + p2.x, p1.y + p2.y);

  def distance(p1: Point, p2: Point) =
    math.sqrt(math.pow(p1.x - p2.x, 2) + math.pow(p1.y - p2.y, 2));

  def move(p1: Point, dx: Int, dy: Int) = Point(p1.x + dx, p1.y + dy);

  def invert(p1: Point) = Point(p1.y, p2.x);

  var p1 = Point(4, 3)
  var p2 = Point(1, 6)

  println("p1 = " + p1)
  println("p2 = " + p2)
  println("Addition of p1,p2 = " + add(p1, p2))
  println("move p1 by (2,2) = " + move(p1, 2, 2))
  println("Distance between p1,p2 = " + distance(p1, p2))
  println("Inverted p2 = " + invert(p2))

}
