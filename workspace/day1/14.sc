import data.Data

Data.books.foreach(println)

Data.books.groupBy(book => book.author)

Data.books.groupBy(book => book.author).foreach(println)
Data.books
  .groupBy(book => book.author)
  .map(t => (t._1, t._2.map(_.basePrice).sum))
  .foreach(println)

val t = (1, "asdasd", 10.23)

Data.books
  .sortBy(- _.basePrice)
  .foreach(println)

Data.books
  .sortBy(book => (book.basePrice, book.title))
  .foreach(println)


