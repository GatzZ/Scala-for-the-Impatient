import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

//P34-------------------------------
//import scala.collection.mutable.ArrayBuffer
//
//var a = ArrayBuffer(1, 2, -4, 5, 5, -6, -8)
//var first = true
//val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
//  if (a(i) < 0) first = false; i
//}
//for (j <- 0 until indexes.length) a(j) = a(indexes(j))
//a.trimEnd(a.length - indexes.length)
//
//

//Chapter 3 Exercise
////1
//val n = 10
//val r = scala.util.Random
//var a = new Array[Int](n)
//Q
//for (i <- 0 until n){
//  a(i) = r.nextInt(n)
//}
//
//a


////Q2
//var a = Array[Int](1, 2, 3, 4, 5)
//for (i <- 0 until (a.length - 1, 2)){ //step size 2
//  val tmp = a(i)
//  a(i) = a(i+1)
//  a(i+1) = tmp
//}
//a


////Q3
//var a = Array[Int](1, 2, 3, 4, 5)
//val b = for (i <- 0 until a.length) yield {
//
//  if (i % 2 != 0) //double index with start point at 1
//    a(i-1)
//  else{
//    if ((i+1) == a.length)
//      a(i)
//    else
//      a(i+1)
//  }
//
//}
//b.toArray


//Q4
//val a = Array(1, 5 , -2, -3, 8, -1, 3, 6, -10)
//val b = (for(i <- a  if i > 0)  yield i ) ++ (for (i <- a if i <= 0) yield i )

//Q5
//val a = Array(1.0, 5.0, -2.0, -3.8)
//val res = a.sum / a.length
////Q6
//val a = Array(1, 5 , -2, -3, 8, -1, 3, 6, -10)
//a.reverse
//
//val b = ArrayBuffer(1, 5 , -2, -3, 8, -1, 3, 6, -10)
//b.reverse

//Q7
//val a = Array(1, 5 , -2, -3, 8, -1, 3, 6, 5, 6 -10)
//a.distinct

//Q8
//val a = Array(1, 5 , -2, -3, 8, -1, 3, 6, 5, 6 -10)
//
//val arr = a.toBuffer
//println(arr.mkString(","))
//
//
//val indexes = ( for(i <- 0 until arr.size; if (arr(i) < 0)) yield i).reverse.dropRight(1).foreach(arr.remove(_))
//
//println(arr.mkString(","))
//Q9
//var a = java.util.TimeZone.getAvailableIDs.toBuffer
//val b = for (i <- 0 until(a.length) if a(i).startsWith("America/")) yield {
//  a(i).drop("America/".length)
//}
//b.sorted

//Q10
import java.awt.datatransfer._
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
println(flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray.toBuffer.mkString(" | "))

