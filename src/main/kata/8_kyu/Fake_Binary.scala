object Fake_Binary {
  def fakeBin(digits: String): String =
    digits.toList.map(x => {if (x > '4') 1 else 0}).mkString
}
