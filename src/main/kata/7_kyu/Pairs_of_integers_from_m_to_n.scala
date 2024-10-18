/*Implement a function that receives two integers m and n and generates a sorted list of pairs (a, b) such that m <= a <= b <= n.

The input m will always be smaller than or equal to n (e.g., m <= n)

Example
m = 2
n = 4

result = [(2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (4, 4)]*/

object Pairs_of_integers_from_m_to_n extends App {
  def pairs(m: Int, n: Int): Seq[(Int, Int)] =
    (m to n).flatMap(a => (a to n).map(b => (a, b))).toList
}
