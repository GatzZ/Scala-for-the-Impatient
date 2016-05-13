/**
  * Created by BackToLiew on 2016/5/13.
  */

object Q3 extends App {
  import random._
  setSeed((System.currentTimeMillis() / 1000).toInt)

  println(seed)
  (1 to 5).foreach(x => println(nextInt()))
  (1 to 5).foreach(x => println(nextDouble()))
}