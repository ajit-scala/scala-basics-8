
val xs = List(1, 2, 3)
val ys = List("a", "b")

xs.map(x => ys.map(y => (x, y)))
xs.map(x => ys.map(y => (x, y))).flatten

xs.flatMap(x => ys.map(y => (x, y)))

xs.flatMap { x =>
  ys.map { y =>
    (x, y)
  }
}

xs.foreach { x =>
  println(x)
}

for {
  x <- xs
  if x > 1
  y <- ys
  if y == "b"
} yield (x, y)


