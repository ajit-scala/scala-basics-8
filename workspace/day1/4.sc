import scala.collection.mutable

val xs = List(1, 3, 2, 6, 4, 9)
def square(x: Int): Int = x * x

def map(xs: List[Int], f: Int => Int): List[Int] = {

  val it = xs.iterator

  val buffer = mutable.Buffer.empty[Int]

  while(it.hasNext) {
    buffer += f(it.next())
  }

  buffer.toList
}

map(xs, x => x * x)
map(xs, square)
