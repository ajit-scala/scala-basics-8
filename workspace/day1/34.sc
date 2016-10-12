
Option(10).get
Option.empty[Int].get


List(10)
List.empty[Int]

List(10).map(_ + 1)
List.empty[Int].map(_ + 1)


Option(10)
Option.empty[Int]


Option(10).map(_ + 1)
Option.empty[Int].map(_ + 1)

val xs = Option(10)
val ys = Option.empty[Int]

xs.flatMap(x => ys.map(y => (x, y)))

for {
  x <- xs
  y <- ys
} yield (x, y)
