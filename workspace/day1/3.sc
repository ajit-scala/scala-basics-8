import scala.collection.mutable

val squareF = { x: Int =>
  x * x
}

def square(x: Int): Int = x * x

val xs = List(1, 3, 2, 6, 4, 9)

xs.map(x => x * x)
xs.map(squareF)
xs.map(square)

//signature of map which works with square

//while, iterator

xs.iterator

val buffer = mutable.Buffer.empty[Int]

buffer += 10

buffer.toList




