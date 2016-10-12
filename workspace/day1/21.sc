
sealed trait Day
case object Weekday extends Day
case object Weekend extends Day

val m = Map("a" -> 1, "b" -> 2)

m.map { case (k, v) =>
  (s"Hello $k", v + 10)
}

m("a")

m.get("a")
m.get("c")


val x: Option[Int] = Some(10)
val y: Option[Int] = None

val x1: List[Int] = List(10)
val y1: List[Int] = Nil

