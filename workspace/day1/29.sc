import sorting.{Ord, Sorter}

Sorter.sort(List(11, 23, 2, 5, 90))(Ord.intOrd)
Sorter.sort(List("xyz", "xbc", "abc"))(Ord.strOrd)

Sorter.sort(List(Some(11), None, Some(2), None))(Ord.optOrdInt)
Sorter.sort(List(Some("xyz"), None, Some("abc"), None))(Ord.optOrdString)
