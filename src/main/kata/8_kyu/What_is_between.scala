/*Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

For example:

  a = 1
b = 4
--> [1, 2, 3, 4]*/



object What_is_between {
  def between(a: Int, b: Int): Seq[Int] = (a to b).toSeq
}
