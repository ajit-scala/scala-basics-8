val xs = List(1, 3, 2, 6, 4, 9)
def square(x: Int): Int = x * x

def map(xs: List[Int], f: Int => Int): List[Int] = {

  val it = xs.iterator

  var list = List.empty[Int]

  while(it.hasNext) {
    list = f(it.next()) :: list
  }

  list.reverse
}

map(xs, x => x * x)
map(xs, square)
