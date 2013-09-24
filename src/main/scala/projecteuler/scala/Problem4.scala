package projecteuler.scala

object Problem4 {
  def main(args: Array[String]) = {
    val nums = Stream.iterate(999*999)(_ - 1).takeWhile(_ > 100*100)
    val seq = 100.to(999)

    val palindromicNumbers = nums.filter{ p =>
      val s1 = p.toString
      s1.zip(s1.reverse).find(c => c._1 != c._2).isEmpty
    }

    val pNum3digitNumProduc = palindromicNumbers.filter{ p =>
      seq.find(n => p % n == 0 && p / n > 99 && p / n < 1000).isDefined
    }

    println(pNum3digitNumProduc.take(1).toList)
  }
}
