package sorting

object Sorter {

  //xs is sorted, so result should also be sorted
  //xs = 1, 3, 55, 90 and x = 23
  //result = 1, 3, 23, 55, 90
  def insert[T: Ord](x: T, xs: List[T]): List[T] = xs match {
    case Nil                                => List(x)
    case head :: tail if Ord[T].lt(x, head) => x :: xs
    case head :: tail                       => head :: insert(x, tail)
  }


  //xs = 23, 2, 1, 45
  //result = 1, 2, 23, 45
  def sort[T: Ord](xs: List[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }

}
