package sorting

object Sorter {

  //xs is sorted, so result should also be sorted
  //xs = 1, 3, 55, 90 and x = 23
  //result = 1, 3, 23, 55, 90
  def insert[T](x: T, xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil                             => List(x)
    case head :: tail if ord.lt(x, head) => x :: xs
    case head :: tail                    => head :: insert(x, tail)(ord)
  }


  //xs = 23, 2, 1, 45
  //result = 1, 2, 23, 45
  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }

}
