val xs = List(1, 3, 2, 6, 4, 9)

def fold[A, B](xs: List[A], acc: B)(f: (B, A) => B): B = {
  if(xs.isEmpty) acc
  else fold(xs.tail, f(acc, xs.head))(f)
}

xs.foldLeft(1)((acc, elm) => acc + elm)

fold(xs, 1) { (acc, elm) =>
  acc + elm
}


xs.foldLeft(Int.MinValue) { (acc, elm) =>
  println(acc)
  if(acc > elm) acc else elm
}

xs.foldLeft(Int.MinValue)((acc, elm) =>
  if (acc > elm) acc else elm
)

xs.foldLeft(Int.MinValue)(_ max _)

xs.reduceLeft(_ max _)
List.empty[Int].reduceLeft(_ max _)

