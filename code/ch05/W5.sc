//Q1
//class Counter(private var value: Int = 0) {
//  def increment() { if (value < Int.MaxValue) value += 1 }
//  def current = value
//}
//
//val c = new Counter(Int.MaxValue - 1)
//
//println(c.current)
//c.increment()
//println(c.current)
//c.increment()
//println(c.current)

//Q2
//class BankAccount() {
//  val balance = 1000
//
//  def deposit(): Unit = {
//    println("deposit")
//  }
//
//   def withdraw() = {
//     println("withdraw")
//   }
//}
//val bankAccount = new BankAccount()
//bankAccount.deposit()
//bankAccount.withdraw()
//println(bankAccount.balance)
//bankAccount.balance = 9999    //readonly

//Q3
//class Time(private var h: Int = 0, private var m: Int = 0) {
//
//  def hours = h
//  def minutes = m
//
//  def before(other: Time) = h * 60 + m < other.h * 60 + other.m
//
//}
//
//val time = new Time(1, 30)
//
//println("Time is: " + time.hours + ":" + time.minutes)
//
//println(time.before(new Time(2, 30)))
//println(time.before(new Time(1, 10)))
//Q4
//class Time(h: Int = 0, m: Int = 0) {
//
//  private var mins = h * 60 + m
//
//  def hours = mins / 60
//  def minutes = mins % 60
//
//  def before(other: Time) = mins < other.mins
//
//}
//
//val time = new Time(1, 30)
//
//println("Time is: " + time.hours + ":" + time.minutes)
//
//println(time.before(new Time(2, 30)))
//println(time.before(new Time(1, 10)))

//Q5
//import scala.beans.BeanProperty
//class Student(@BeanProperty var Name: String, @BeanProperty var id: Long)
//
//# scalac 05.scala
//# javap -private Student
//Q6
//class Person(var age: Int = 0) {
//  if (age < 0) age = 0
//}
//val p = new Person(20)
//println(p.age)
//val n = new Person(-25)
//println(n.age)
//Q7
//class Person(name: String) {
//  val firstName = name.split("\\s+")(0)
//  val lastName = name.split("\\s+")(1)
//
//  override def toString = "Person(" + firstName + ", " + lastName + ")"
//}
//
//val p = new Person("Fred Smith")
//println(p)

//Q8
//class Car(val manufactuer : String, val model: String, val year: Int = -1, var license: String = "") {
//  override def toString = "Car(%s, %s, %d, %s)".format(manufactuer, model, year, license)
//}
//
//val c1 = new Car("Honda", "Civic", 2011, "xx123zz")
//println(c1)
//val c2 = new Car("Hummer", "H1", 2010)
//println(c2)
//val c3 = new Car("Opel", "Astra")
//println(c3)

//Q10
class Employee(val name: String, var salary: Double) {
  def this() { this("John Q. Public", 0.0) }
  override def toString = "Employee(%s, %f)".format(name, salary)
}

// i'm not supposed to do, but a right direction
// proposed by Cay Horstmann: http://stackoverflow.com/a/10999828

class LongEmployee {
  private var _name = "John Q. Public"
  var salary = 0.0

  def this(n: String, s: Double) {
    this()
    _name = n;
    salary = s;
  }

  def name = _name // read-only property, but private var
  override def toString = "LongEmployee(%s, %f)".format(name, salary)
}


val e1 = new Employee()
println(e1)

val l1 = new LongEmployee()
println(l1)

val e2 = new Employee("John Smith", 100.5)
println(e2)

val l2 = new LongEmployee("John Smith", 100.5)
println(l2)




