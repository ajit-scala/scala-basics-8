case class Person(age: Int, name: String)

val p = Person(33, "abc")

def m(x: Any) = x match {
  case 1                 => 1
  case s: String         => s.length
  case Array(a, b)       => 2
  case (_, _, c: String) => c.length
  case Person(age, name) => age
}


m(Array(4, 40))
m(p)

