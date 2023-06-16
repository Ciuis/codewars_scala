import scala.collection.mutable

object Multiple_of_index {
  def multipleOfIndex(xs: Seq[Int]): Seq[Int] =
    xs.zipWithIndex.filter {case (i, index) => i == 0 || (index != 0 && i % index == 0)}.map(_._1)
}
