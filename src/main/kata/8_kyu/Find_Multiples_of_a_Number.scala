object Find_Multiples_of_a_Number extends App {
  def findMultiples(n: Int, limit: Int): List[Int] = (n to limit by n).toList
}
