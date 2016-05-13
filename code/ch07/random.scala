/**
  * Created by BackToLiew on 2016/5/13.
  */
package object random {
  var seed: Int = 0

  def setSeed(value: Int) = seed = value

  def nextInt() = {
    seed = seed * 1664525 + 1013904223 % (2 ^ 32)
    seed
  }

  def nextDouble(): Double = nextInt().toDouble / Int.MaxValue.toDouble
}

