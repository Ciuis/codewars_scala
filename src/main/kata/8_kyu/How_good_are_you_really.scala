object How_good_are_you_really {
  def betterThanAverage(classPoints: Seq[Int], yourPoints: Int): Boolean = classPoints.sum / classPoints.length < yourPoints
}
