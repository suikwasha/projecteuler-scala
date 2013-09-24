package projecteuler.scala

object Problem1 {
  def main(args: Array[String]) = {
    val ans = 1.to(1000).filter(p => p % 3 == 0 || p % 5 == 0).foldLeft(0)(_ + _)
    println(ans)
  }
}
