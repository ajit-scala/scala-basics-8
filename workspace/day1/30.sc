import data.Data.books
import sorting.{Ord, Sorter}


Sorter.sort(List(11, 23, 2, 5, 90))
Sorter.sort(List("xyz", "xbc", "abc"))

Sorter.sort(List(Some(11), None, Some(2), None))

Sorter.sort(List(Some("xyz"), None, Some("abc"), None))

{
  implicit val intOrd: Ord[Int] = new Ord[Int] {
    override def lt(x: Int, y: Int): Boolean = x > y
  }
  println(Sorter.sort(List((24, "sd"), (24, "ab"), (10, "xy"))))

  Sorter.sort(List((Some(24), Some("sd")), (Some(24), None), (None, Some("xy"))))
}

Sorter.sort(books)
