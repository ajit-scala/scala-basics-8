
case class Address(street: String, pin: Int)

val a1 = new Address("baner", 21)
val a2 = Address.apply("baner", 21)

Address
Address: AnyRef
Address: (String, Int) => Address



a1.hashCode()
a2.hashCode()

a1 == a2

a1 eq a2

a1.copy(pin = 100)

