val rootDir = "F:\\Scala_study\\scala-impatient-code\\code\\ch09\\"
//Q1
//import io.Source
//import java.io.PrintWriter
//val source = Source.fromFile("F:\\Scala_study\\scala-impatient-code\\code\\ch09\\test1.txt", "UTF-8")
//val out = new PrintWriter("F:\\Scala_study\\scala-impatient-code\\code\\ch09\\test1_out.txt")
//val lineIterator = source.getLines.toArray[String].reverse.foreach(out.println(_))
//out.close()
//source.close()

//Q2
//import io.Source
//import java.io.PrintWriter
//val fin = Source.fromFile(rootDir + "test2.txt")
//val fout = new PrintWriter(rootDir + "test2_out.txt")
//for (l <- fin.getLines) {
//  fout.println(l.toString.replace("\t", "    "))
//}
//fout.close()
//fin.close()

//Q3
//import io.Source
//Source.fromFile(rootDir + "test3.txt").foreach(c => if (c.toInt > 12) println(c))

//Q4
//import io.Source
//val numbers = io.Source.fromFile(rootDir + "test4.txt").mkString.split("""\s+""").map(_.toDouble)
//println("numbers.min = " + numbers.min)
//println("numbers.max = " + numbers.max)
//println("numbers.sum / numbers.size = " + numbers.sum / numbers.length)

//Q5
//import java.io.PrintWriter
//import math.pow
//val fout = new PrintWriter(rootDir + "test_out5.txt")
//for (i <- 1 to 10 ) {
//  fout.println(pow(2, i) + " " + 1 / pow(2, i))
//}
//fout.close()

//Q6
//val pattern = """"([^"\\]*([\\]+"[^"\\]*)*)"""".r
//
//for(str <- io.Source.stdin.getLines) {
//  pattern findFirstIn str match {
//    case Some(s: String) => println(s)
//    case None =>
//  }
//}

//Q7
//val tokens = io.Source.fromFile("07.txt").mkString.split("""\s+""").filter(
//  "^[0-9]+(\\.[0-9]+)?$".r findFirstIn _ match {
//    case Some(_) => false
//    case None => true
//  }
//)
//
//println("Tokents: " + tokens.mkString(", "))

//Q8
//val html = io.Source.fromURL("http://horstmann.com", "UTF-8").mkString
//
//val srcPattern = """(?is)<\s*img[^>]*src\s*=\s*['"\s]*([^'"]+)['"\s]*[^>]*>""".r
//
//for(srcPattern(s) <- srcPattern findAllIn html) println(s)

//Q9
//import java.io.File
//import scala.util.matching.Regex
//
//def countMatchFiles(dir: File, pattern: Regex): Int = {
//  val subdirs = dir.listFiles.filter(_.isDirectory)
//  val fileNames = dir.listFiles.filter(!_.isDirectory).map(_.getName)
//
//  subdirs.map(countMatchFiles(_, pattern)).sum +
//    (for(f <- fileNames; s <- pattern findFirstIn f) yield s).size
//}
//
//println("Count of *.scala files: %d".format(countMatchFiles(new File("../"), "\\.scala$".r)))
//
//// more elegant solution
//def getFileTree(f: File): Stream[File] =
//  f #:: (if (f.isDirectory) f.listFiles().toStream.flatMap(getFileTree) else Stream.empty)
//
//println("More elegant solution: %d".format(getFileTree(new File("../")).filter(_.getName.endsWith(".scala")).size))

//Q10

import collection.mutable._
import java.io._

class Person(val name: String) extends Serializable {
  private val friends = new ArrayBuffer[Person]
  // some kind of DSL :-)
  def friend(f : Person) = friends += f
  override def toString = "%s {%s}".format(name, friends.map(_.name).mkString(", "))
}

object Person {
  def apply(name : String) = new Person(name)
}

object Main extends App {

  val anna = Person("Anna")
  val boris = Person("Boris")
  val clair = Person("Clair")

  anna friend boris
  boris friend anna
  anna friend clair
  clair friend boris

  val all = Array(anna, boris, clair)

  println("Original objects: " + all.mkString(", "))

  val out = new ObjectOutputStream(new FileOutputStream("10.out"))
  out.writeObject(all)
  out.close()

  val in = new ObjectInputStream(new FileInputStream("10.out"))
  val res = in.readObject().asInstanceOf[Array[Person]]
  in.close()
}