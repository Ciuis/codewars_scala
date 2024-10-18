/*
This is a question from codingbat

Given an integer n greater than or equal to 0, create and return an array with the following pattern:

  squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) => [0, 1, 2, 1]
squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

n<=1000.
*/



object Array_squareUp_b extends App {
  def squareUp(n: Int): List[Int] = {
    var list  = List.fill(n*n)(0)
    // Число для заполнения элементов
    var num = 1
    // Цикл по строкам квадрата в обратном порядке
    for (i <- n to 1 by -1) {
      // Цикл по элементам строки в обратном порядке
      for (j <- i to 1 by -1) {
        // Заполняем элемент числом
        list = list.updated((i-1)*n + j-1, num)

        num += 1
      }
      // Сбрасываем число на 1
      num = 1
    }
    // Возвращаем массив
    return list
  }

  println(squareUp(3))
}
