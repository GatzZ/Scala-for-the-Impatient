import scala.collection.mutable.ArrayBuffer


//Q1 and Q2
//class BankAccount(initialBalance: Double) {
//  private var balance = initialBalance
//  def deposit(amount: Double) = { balance += amount; balance }
//  def withdraw(amount: Double) = { balance -= amount; balance }
//  override def toString = "Balance = %f".format(balance)
//}
//
//
//class CheckedAccount(initialBalance: Double, fee: Double) extends BankAccount (initialBalance:Double) {
//  override def deposit(amount: Double) = {super.deposit(amount - fee)}
//  override def withdraw(amount: Double) = {super.withdraw(amount + fee)}
//}
//
////class CheckedAccount(initialBalance: Double, val comission: Double = 1.0)
////  extends BankAccount(initialBalance:Double) {
////  override def deposit(amount: Double) = super.deposit(amount - comission);
////  override def withdraw(amount: Double) = super.withdraw(amount + comission);
////}
//
//
//val b = new BankAccount(100.0)
//
//b.deposit(100);
//println(b)
//b.withdraw(100);
//println(b)
//val a = new CheckedAccount(100.0, 1)
//a.deposit(100);
//println(a)
//a.withdraw(100);
//println(a)

//Q4
//abstract class Item {
//  def price: Double
//  def description: String
//}
//
//class SimpleItem(val price: Double = 1.0, val description: String = "Empty") extends Item {}
//
//object Bundle {
//  var itemList = new ArrayBuffer[SimpleItem]
//
//  def description() = {
//    for (item: SimpleItem <- itemList) {
//      println("Price: " + item.price + " description: " + item.description)
//    }
//  }
//
//  def additem(x: SimpleItem): Unit = {
//    itemList += x
//  }
//}
//
//val item1 = new SimpleItem()
//val item2 = new SimpleItem(2, "Item 2")
//
//Bundle.additem(item1)
//Bundle.additem(item2)
//Bundle.description()


//Q5
//class Point(val x: Int, val y: Int) {
//  override def toString = "Point(%d, %d)".format(x, y)
//}
//
//class LabeledPoint(val label: String, x: Int, y: Int) extends Point(x, y) {
//  override def toString = { "LabeledPoint(%s, %d, %d)".format(label, x, y) }
//}
//
//val a = new Point(1, 1)
//println(a)
//
//val b = new LabeledPoint("Some point", 20, 50)
//println(b)
//

//Q6
//class Point(val x: Int, val y: Int) {
//  override def toString = "Point(%d, %d)".format(x, y)
//}
//
//
//abstract class Shape {
//  def centerPoint: Point
//  override def toString =  "%s(Center: %s)".format(this.getClass.getSimpleName, centerPoint.toString)
//}
//
//class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
//  override val centerPoint = new Point((bottomRight.x + topLeft.x) / 2, (bottomRight.y + topLeft.y) / 2)
//}
//
//class Circle(override val centerPoint: Point, val radius: Int) extends Shape
//
//
//val r = new Rectangle(new Point(0,0), new Point(10, 10))
//println(r)
//
//val c = new Circle(new Point(7, 7), 10)
//println(c)


//Q7
//import java.awt.Rectangle
//
//class Square(x: Int = 0, y: Int = 0, width: Int = 0) extends Rectangle(x, y, width, width) {
//  def this(width: Int) = this(0, 0, width)
//}
//
//
//val s1 = new Square(1, 1, 3)
//println(s1)
//
//val s2 = new Square()
//println(s2)
//
//val s3 = new Square(5)
//println(s3)


//Q9
//original case1
//class Creature {
//  val range: Int = 10
//  val env: Array[Int] = new Array[Int](range)
//}
//class Ant extends Creature {
//  override val range = 2
//}
//val ant1 = new Ant()
//ant1.env    //res0: Array[Int] = Array()


//case2: change val to lazy val for Creature.range
//class Creature {
//  lazy val range: Int = 10
//  val env: Array[Int] = new Array[Int](range)
//}
//class Ant extends Creature {
//  override lazy val range = 2
//}
//val ant1 = new Ant()
//ant1.env   //res0: Array[Int] = Array(0, 0)  --range = 2

//case3:  change val to final val for Creature.range
//class Creature {
//  val range: Int = 10
//  val env: Array[Int] = new Array[Int](range)
//}
//class Ant extends Creature {
//  override final val range = 2
//}
//val ant1 = new Ant()
//ant1.env   //res0: Array[Int] = Array(0, 0)  --range = 2

////case4: change val to def for Creature.range
//class Creature {
//  def range: Int = 10
//  val env: Array[Int] = new Array[Int](range)
//}
//class Ant extends Creature {
//  override val range = 2
//}
//val ant1 = new Ant()
//ant1.env   //res0: Array[Int] = Array()

//case5: change val to def for Creature.range and  change val to def for Ant.range
//class Creature {
//  def range: Int = 10
//  val env: Array[Int] = new Array[Int](range)
//}
//class Ant extends Creature {
//  override def range: Int = 2
//}
//val ant1 = new Ant()
//ant1.env   //res0: Array[Int] = Array(0, 0) ---range = 2

//case5: change val to def for Creature.range
class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}
class Ant extends Creature {
  override val range: Int = 2
}
val ant1 = new Ant()
ant1.env   //res0: Array[Int] = Array(0, 0) ---range = 2


