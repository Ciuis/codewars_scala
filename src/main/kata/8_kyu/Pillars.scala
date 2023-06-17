/*
There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same. Your function accepts three arguments:

  number of pillars (≥ 1);
distance between pillars (10 - 30 meters);
width of the pillar (10 - 50 centimeters).

  Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).
*/


object Pillars {
  def distance(n: Int, d: Int, w: Int ): Int = if (n == 1) 0 else (d*100 + w) * n - (w * 2 + d*100)
}
