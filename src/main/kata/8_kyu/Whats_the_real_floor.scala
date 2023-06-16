object Whats_the_real_floor extends App {
  def getRealFloor(n: Int): Int = if (n < 0) n else if (n <= 1) 0 else if (n < 13) n - 1 else n - 2
}
