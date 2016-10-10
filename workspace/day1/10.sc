
val xs = List(1, 3, 2, 6, 4, 9)


//def loop(xs: List[Int], acc: List[Int]): List[Int] = {
//  if(xs.isEmpty) acc else loop(xs.tail, xs.head :: acc)
//}

def loop(xs: List[Int], f: Int => Int, acc: List[Int]): List[Int] = {
  if(xs.isEmpty) acc else loop(xs.tail, f, f(xs.head) :: acc)
}

def reverse(xs: List[Int]): List[Int] = loop(xs, identity, Nil)

reverse(xs)

def fold(xs: List[Int], acc: List[Int], f: (List[Int], Int) => List[Int]): List[Int] = {
  if(xs.isEmpty) acc else fold(xs.tail, f(acc, xs.head), f)
}

def reverse2(xs: List[Int]): List[Int] = fold(xs, Nil, (acc, elm) => elm :: acc)



reverse2(xs)

xs.foldLeft(List.empty[Int])((acc, elm) => elm :: acc)
xs.foldLeft("")((acc, elm) => acc + elm.toString)
xs.foldLeft("")(_ + _)
