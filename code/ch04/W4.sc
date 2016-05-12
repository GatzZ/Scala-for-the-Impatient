//Q1
//val map1 = Map("Nike" -> 1, "Adidas" -> 2)
//
//val map2 = for ((k,v) <- map1) yield (k, v * 0.9)

//Q2
//import scala.io.Source
//import scala.collection.mutable
//val source = Source.fromFile("F:\\Scala_study\\scala-impatient-code\\code\\ch04\\myfile.txt")
//val tokens = source.mkString.split("\\s+")
//var word_count = mutable.Map[String, Int]()
//for (word <- tokens){
//  if (word_count.contains(word))
//    word_count(word) += 1
//  else
//    word_count(word) = 1
//}
//word_count

//Q3
//import scala.io.Source
//val source = Source.fromFile("F:\\Scala_study\\scala-impatient-code\\code\\ch04\\myfile.txt")
//val tokens = source.mkString.split("\\s+")
//var word_count = new scala.collection.immutable.HashMap[String, Int]
//
//tokens.foreach { word =>
//  word_count = word_count + (word -> (word_count.getOrElse(word, 0) + 1) )
//}
//word_count


//Q4
import java.util

//import scala.io.Source
//
//val source = Source.fromFile("F:\\Scala_study\\scala-impatient-code\\code\\ch04\\myfile.txt")
//val tokens = source.mkString.split("\\s+")
//var word_count = new scala.collection.immutable.TreeMap[String, Int]
//
//tokens.foreach { word =>
//  word_count = word_count + (word -> (word_count.getOrElse(word, 0) + 1))
//}
//word_count

//Q5
//import scala.io.Source
////!!!!!!!!!!!!!!!!!!!! Java Conversion !!!!!!!!!!
//import scala.collection.JavaConversions.mapAsScalaMap
//val source = Source.fromFile("F:\\Scala_study\\scala-impatient-code\\code\\ch04\\myfile.txt")
//val tokens = source.mkString.split("\\s+")
//val word_count: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
//tokens foreach { token =>
//  word_count(token) = word_count.getOrElse(token, 0) + 1
//}
//word_count

//Q6
//import java.util.Calendar._
//val days = scala.collection.mutable.LinkedHashMap(
//  "MONDAY" -> MONDAY,
//  "TUESDAY" -> TUESDAY,
//  "WEDNESDAY" -> WEDNESDAY,
//  "THURSDAY" -> THURSDAY,
//  "FRIDAY" -> FRIDAY,
//  "SATURDAY" -> SATURDAY,
//  "SUNDAY" -> SUNDAY
//)
//for ((k, v) <- days)
//  printf("%s=%d\n", k, v)


//Q7
//import scala.collection.JavaConversions.propertiesAsScalaMap
//
//val properties = propertiesAsScalaMap(System.getProperties())
//
//val maxkey = properties.keySet.map(_.length).max
//
//println(maxkey)
//for ((k, v) <- properties) printf("%-" + maxkey + "s | %s\n", k, v)

//Q8
//val a = Array(-1, 3, -9, 10, 12)
//def minmax(values: Array[Int]) = {
//  (values.min, values.max)
//}
//minmax(a)
//Q9
//def lteqgt(values: Array[Int], v : Int) = (
//  values.count(_ < v),
//  values.count(_ == v),
//  values.count(_ > v)
//  )
//
//val a = Array(-1, 3, -9, 10, 12)
//lteqgt(a, 3)

//Q10
//val res = "Hello".zip("World")


