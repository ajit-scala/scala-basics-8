

import data.Book
import data.Data.books

books
  .filter(_.author == "odersky")
  .map(_.basePrice)

val pf: PartialFunction[Book, Double] = {
  case Book("odersky", _, price, _) => price
}

val pf1: PartialFunction[Book, Double] = {
  case b: Book if b.author == "odersky" => b.basePrice
}

books
  .filter(pf.isDefinedAt)
  .map(pf)

books.collect(pf)
books.collect {
  case Book("odersky", _, price, _) => price
}
