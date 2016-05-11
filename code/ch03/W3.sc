import scala.collection.JavaConverters._

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
//
//for (i <- 0 until n){
//  a(i) = r.nextInt(n)
//}
//
//a


////2
//var a = Array[Int](1, 2, 3, 4, 5)
//for (i <- 0 until (a.length - 1, 2)){ //step size 2
//  val tmp = a(i)
//  a(i) = a(i+1)
//  a(i+1) = tmp
//}
//a

//3
var a = Array[Int](1, 2, 3, 4, 5)
val b = for (i <- 0 until a.length) yield {

  if (i % 2 != 0) //double index with start point at 1
    a(i-1)
  else{
    if ((i+1) == a.length)
      a(i)
    else
      a(i+1)
  }

}
b.toArray


