
import data.Data.books

books.map(_.basePrice)

Seq(1).map(_ + 10)
Set(1).map(_ + 10)
Map(1 -> "a").map { case (k, v) =>
  k -> s"Hello $v"
}
Map(1 -> "a").map { case (k, v) =>
  (v, k)
}
Map(1 -> "a").map { case (k, v) =>
  v
}
