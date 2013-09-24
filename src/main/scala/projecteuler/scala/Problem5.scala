package projecteuler.scala

import scala.collection.immutable.IndexedSeq

object Problem5 {
  def main(args: Array[String]) = {
    val Max = 20
    val Min = 1

    val stream = Stream.iterate(Max)(_ + Max).view
    val filters: IndexedSeq[(Int) => Boolean] = Min.to(Max).map{ t => x: Int =>
      x % t == 0
    }

    val ansList = filters.foldLeft(stream)(_.filter(_))
    println(ansList.take(1))
  }
}
