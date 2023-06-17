/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
*/


object Reversed_sequence {
  def reverseSeq(n: Int): Range = (n to 1 by -1).toSeq
}
