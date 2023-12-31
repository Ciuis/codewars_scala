/*Make a function that returns the value multiplied by 50 and increased by 6. If the value entered is a string it should return "Error".*/


object Super_Duper_Easy extends App {
  def problem(a: String): String = {
    a.toInt match {
      case i => (i * 50 + 6).toString
      case _ => "Error"
    }
  }
}
