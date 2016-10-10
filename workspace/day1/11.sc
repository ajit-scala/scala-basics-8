val xs = List(1, 2, 3, 4, 5)

xs.foldLeft("seed-") { (acc, elm) =>
  println(acc)
  acc + elm
}


xs.foldLeft(List.empty[Int]) { (acc, elm) =>
  println(acc)
  elm :: acc
}

xs.foldLeft(0) { (acc, elm) =>
  println(acc)
  acc + elm
}

xs.foldLeft(1) { (acc, elm) =>
  println(acc)
  acc * elm
}

