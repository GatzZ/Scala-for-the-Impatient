////Q1/*
//object Conversions {
//  def inchesToCentimeters(x: Double) = {
//    x / 2.54
//  }
//
//  def gallonsToLiters(x: Double) = {
//    x * 3.7854
//  }
//
//  def milesToKiloMeters(x: Double) = {
//    x * 1.609344
//  }
//}
//
//val a = Conversions.inchesToCentimeters(5.08)
//
////Q2
//abstract class UnitConversion {
//  def inchesToCentimeters(): Unit
//
//  def gallonsToLiters(): Unit
//
//  def milesToKiloMeters(): Unit
//}
//
//
//object NewUnitConversion extends UnitConversion {
//  def inchesToCentimeters() = {}
//
//  def gallonsToLiters() = {}
//
//  def milesToKiloMeters() = {}
//}
//
//// Alexander Mikhailov more elegant solutions for Chapter6 --------------
//
//class UnitConversion(val factor: Double) {
//  def convert(value: Double): Double = factor * value
//}
//
//object InchesToSantimeters extends UnitConversion(2.54)
//object GallonsToLiters extends UnitConversion(3.78541178)
//object MilesToKilometers extends UnitConversion(1.609344)
//
//println("%f inch = %f santimeters".format(1.0, InchesToSantimeters.convert(1.0)))
//println("%f gallon = %f liters".format(1.0, GallonsToLiters.convert(1.0)))
//println("%f mile = %f kilometers".format(1.0, MilesToKilometers.convert(1.0)))
//
//// Alexander Mikhailov more elegant solutions for Chapter6 --------------


//Q3
//object Origin extends java.awt.Point
//Origin.getClass.getMethods().map(_.getName).foreach(println(_))


//Q4
//class Point(val x: Int, val y: Int) {}
//
//object Point {
//  def apply(x: Int, y: Int): Point = {
//    new Point(x, y)
//  }
//}
//
//val p1 = Point(3, 4)
//p1.x
//p1.y
//
////Q6
//object Suits extends Enumeration {
//  type Suits = Value
//  val Spade = Value("♠")
//  val Club = Value("♣")
//  val Heart = Value("♥")
//  val Diamond = Value("♦")
//}
//
//println(Suits.values)

//Q7
//object Suits extends Enumeration {
//  type Suits = Value
//  val Spade = Value("♠")
//  val Club = Value("♣")
//  val Heart = Value("♥")
//  val Diamond = Value("♦")
//  def isRed(card: Suits) = card == Heart || card == Diamond
//}
//
//println(for (s <- Suits.values) yield (s, Suits.isRed(s)))

//Q8
object RGBCube extends Enumeration {
  val black = Value(0x000000, "Black")
  val red = Value(0xff0000, "Red")
  val green = Value(0x00ff00, "Green")
  val blue = Value(0x0000ff, "Blue")
  val yellow = Value(0xffff00, "Yellow")
  val magenta = Value(0xff00ff, "Magenta")
  val cyan = Value(0x00ffff, "Cyan")
  val white = Value(0xffffff, "White")
}

for( c <- RGBCube.values ) println("0x%06x: %s".format(c.id, c))


