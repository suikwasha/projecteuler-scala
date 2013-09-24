package projecteuler.scala.util

object EratosthenesSieve {
  def main(args: Array[String]) = {
    val Num = 600851475143L
    val sieve = EratosthenesSieve(Num)
    for(p <- sieve) println(p)
  }

  def apply(limit: Long): Seq[Long] = {
    val sqrt = Math.sqrt(limit).toLong

    val xs = Stream.iterate(2L)(_ + 1L)
    val sieve = applyFilters(xs, sqrt)
    sieve.takeWhile(_ < limit)
  }

  private def applyFilters(xs: Stream[Long], limit: Long): Stream[Long] = {
    val head = xs.head
    if (head < limit)
      Stream.cons(head, applyFilters(xs.filter(p => p % head != 0), limit))
    else
      xs
  }
}
