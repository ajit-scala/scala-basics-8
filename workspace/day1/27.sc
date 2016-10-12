class Person(val age: Int, val name: String)

object A {
  def apply(age: Int, name: String) = new Person(age, name)
}
object B {
  def unapply(p: Person): Option[(Int, String)] = Some(p.age, p.name)
}
object C {
  def unapply(p: Person): Option[(Int, String)] = Some(p.name.length, p.name)
}

val p = A(33, "abc")
val B(a, n) = p

val Some((33, y)) = B.unapply(p)

val C(a1, n1) = p
C.unapply(p)
a
n

a1
n1
