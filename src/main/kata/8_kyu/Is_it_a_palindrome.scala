object Is_it_a_palindrome {
  def isPalindrome(s: String): Boolean = if (s.toLowerCase == s.reverse.toLowerCase) true else false
}
