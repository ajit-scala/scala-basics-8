

val xs = List(1, 2, 3)

val ys = List("a", "b", "c")

val ms = xs.zip(ys).toMap

xs.map(x => ms(x))
xs.map(ms)

