import data.{Book, Data}
import Data.books

Data.books(1)
Data.books.apply(1)

val f = Data.books: Int => Book

f

val bookSet = Data.books.toSet


bookSet(books.head)

val p = bookSet: Book => Boolean

val ms = Map(1 -> "a", 2 -> "b")

ms: Int => String
