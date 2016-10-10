
class GujratCanDrink extends Function1[Int, Boolean] {
  override def apply(age: Int): Boolean = false
}

class EuropeCanDrink extends Function1[Int, Boolean] {
  override def apply(age: Int): Boolean = age > 18
}

class EuropeCanDrink2 extends (Int => Boolean) {
  override def apply(age: Int): Boolean = age > 18
}

val f = new (Int => Boolean) {
  override def apply(age: Int): Boolean = age > 18
}



val europeCanDrink: EuropeCanDrink2 = new EuropeCanDrink2
val europeCanDrink2: Function1[Int, Boolean] = new EuropeCanDrink2

val europeCanDrink3: Int => Boolean = new EuropeCanDrink2

val europeCanDrink4: Int => Boolean = { age: Int =>
  age > 18
}

val europeCanDrink5: Int => Boolean = { age =>
  age > 18
}

val europeCanDrink6: Int => Boolean = age => age > 18
val europeCanDrink7: Int => Boolean = _ > 18



class Person(age: Int, isFemale: Boolean) {

  def isWise =
    if(isFemale) age > 18 else age > 21

  def canDrink(f: Int => Boolean) = f.apply(age)

}


val p = new Person(33, false)

p.isWise
p.canDrink(new GujratCanDrink)
p.canDrink(europeCanDrink)
p.canDrink(_ > 18)
p.canDrink(age => age > 18)
p.canDrink(f)


