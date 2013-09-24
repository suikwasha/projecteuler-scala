package projecteuler.scala

import util.EratosthenesSieve

object Problem3 {
  def main(args: Array[String]) = {
    val Num = 600851475143L
    val sieve = EratosthenesSieve(Num)

    val ans = solve(Num, sieve)
    println(ans)
  }

  def solve(num: Long, sieve: Seq[Long]): Long = {
    val p = sieve.head
    if (num == p) {
      p
    } else if (num % p == 0) {
      solve(num / p, sieve)
    } else {
      solve(num, sieve.tail)
    }
  }
}
