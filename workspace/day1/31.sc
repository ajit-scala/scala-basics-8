import data.Book
import play.api.libs.json.Json

val book = Book("odersky", "scala prog", 100, false)

val json = Json.toJson(book)

Json.prettyPrint(json)

json.as[Book]

import data.Data.books

books.sortBy(book => (book.basePrice, book.title))

books.max

books.map(_.basePrice).sum