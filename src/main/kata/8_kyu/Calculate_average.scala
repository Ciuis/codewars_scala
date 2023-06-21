object Calculate_average {
  def findAverage(numbers: Seq[Int]): Double = if(numbers.isEmpty) 0.0 else numbers.sum.toDouble / numbers.length
}

