/*
I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.
*/


object Array_plus_array {
  def arrayPlusArray(xs: Seq[Int], ys: Seq[Int]): Int = xs.zipAll(ys, 0, 0).map {case (x, y) => x + y}.sum
}
