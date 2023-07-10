import scala.math.abs

object Will_there_be_enough_space {
  def enough(cap: Int, on: Int, wait: Int): Int = (on + wait < cap) match {
    case true => 0
    case _ => abs(cap - (on + wait))
  }
}
