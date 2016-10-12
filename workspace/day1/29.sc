import data.Book
import sorting.{Ord, Sorter}
import data.Data.books

Sorter.sort(List(11, 23, 2, 5, 90))(Ord.intOrd)
Sorter.sort(List("xyz", "xbc", "abc"))(Ord.strOrd)

Sorter.sort(List(Some(11), None, Some(2), None))(
  Ord.optOrd(Ord.intOrd)
)

Sorter.sort(List(Some("xyz"), None, Some("abc"), None))(
  Ord.optOrd(Ord.strOrd)
)

Sorter.sort(List((24, "sd"), (24, "ab"), (10, "xy")))(
  Ord.tupleOrd(Ord.intOrd, Ord.strOrd)
)

Sorter.sort(List((Some(24), Some("sd")), (Some(24), None), (None, Some("xy"))))(
  Ord.tupleOrd(Ord.optOrd(Ord.intOrd), Ord.optOrd(Ord.strOrd))
)

Sorter.sort(books)(Book.ordBook)
