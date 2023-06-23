object Is_he_gonna_survive {
  def hero(bullets: Int, dragons: Int): Boolean = if (dragons  < 1) true else bullets / dragons > 1
}
