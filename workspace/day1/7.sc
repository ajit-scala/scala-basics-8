import scala.annotation.tailrec

val xs = List(1, 3, 2, 6, 4, 9)
def square(x: Int): Int = x * x

def map(xs: List[Int], f: Int => Int): List[Int] = {
  if(xs.isEmpty) Nil else f(xs.head) :: map(xs.tail, f)
}

map(xs, x => x * x)
map(xs, square)

map((1 to 1000).toList, square)

@tailrec
def loop(xs: List[Int], f: Int => Int, acc: List[Int]): List[Int] = {
  if(xs.isEmpty) acc else loop(xs.tail, f, f(xs.head) :: acc)
}


def map2(xs: List[Int], f: Int => Int): List[Int] =
  loop(xs, f, Nil).reverse

map2((1 to 10000).toList, square)
