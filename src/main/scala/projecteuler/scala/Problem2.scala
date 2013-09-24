package projecteuler.scala

import scala.collection.immutable.StreamView

object Problem2 {
  def main(args: Array[String]) = {
    lazy val fib: Stream[Long] = Stream.cons(0L, Stream.cons(1L, fib.zip(fib.tail).map(p => p._1 + p._2)))
    val evenFib: StreamView[Long, Stream[Long]] = fib.view.filter(_ % 2 == 0)
    val under4M: StreamView[Long, Stream[Long]] = evenFib.takeWhile(_ < 4000000L)
    val sum = under4M.foldLeft(0L)(_ + _)
    println(sum)
  }
}
