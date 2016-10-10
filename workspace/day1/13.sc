import data.Data

Data.books.foreach(println)


Data.books.map(book => book.title).foreach(println)
Data.books.map(book => book.basePrice).foreach(println)

Data.books
  .filter(book => book.author == "odersky")
  .map(book => book.title)
  .foreach(println)

Data.books
  .filter(book => book.author == "odersky")
  .map(book => book.basePrice)
  .sum

Data.books
  .filter(book => book.author == "odersky")
  .foldLeft(0.0)((acc, book) => acc + book.basePrice)
