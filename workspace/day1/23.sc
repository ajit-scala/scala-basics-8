

def increment(x: Option[Int]): Option[Int] = x match {
  case Some(dd) => Some(dd + 1)
  case None     => None
}

increment(Some(100))
increment(None)

val xs = List(1, 2, 3, 4)

def length(xs: List[Int]): Int = xs match {
  case Nil                   => 0
  case asdas :: ddd          => 1 + length(ddd)
  case f :: s :: t :: rest   => 100
  case Seq(f, s, t, rest@_*) => 0
}

def m(xs: Seq[Int]) = xs match {
  case Seq(_, _, _, rest@_*) => rest
  case _                     => Seq()
}

m(Seq(1, 2, 3, 4, 5, 6, 7, 8))
