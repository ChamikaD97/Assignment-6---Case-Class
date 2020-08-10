case class Point(x : Int , y : Int) {
  def add ( that : Point)  = Point(this.x +that.x , this.y + that.y)//add 2 points
  def move ( dx : Int , dy : Int) = Point(this.x + dx , this.y + dy)//move points
  def distance ( a : Point): Double = scala.math.sqrt((scala.math.pow((a.x - this.x),2) + scala.math.pow((a.y - this.y),2) ))//calculation the distance
  def invert()  = Point(this.y , this.x)//invert the point. (x,y) -> (y,x)
}
object caseClass extends App {

  val X = Point(20,30)
  val Y = Point(5,10)

  val sum = X add Y;
  val move = X.move(5,5)
  val distance = X.distance(Y)
  val Xinvert =  X.invert()
  val Yinvert =  Y.invert()

  println("X ="+X + "   Y ="+Y)
  println(" ")
  println("X(20,30) + Y(5,10)       :- " + sum)
  println(" ")

  println("Move X by 5,5            :- " + move)
  println(" ")

  println("Invert of X              :- " + Xinvert)
  println("Invert of Y              :- " + Yinvert)
  println(" ")

  println("Distance between X and Y :- " +distance)
}
