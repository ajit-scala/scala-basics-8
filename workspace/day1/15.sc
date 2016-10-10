List.apply(1, 2, 3)

Set.apply(1, 2, 3, 2)

Map.apply(1 -> "a", 2 -> "b")

val xs = List(1, 2, 3)
val ys = Set(2, 1, 2, 3)
val zs = Set("aaa", "bbb")
val ms = Map(1 -> "a", 2 -> "b")

xs.apply(2)


ys
ys(2)
zs.apply("bbb")

ms(1)
ms.apply(10)

