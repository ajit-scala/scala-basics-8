package data

import play.api.libs.json.{JsString, JsValue, Json, Writes}
import sorting.Ord


case class Address(street: String, pin: Int)

object Address {
  
}

case class Person(name: String, address: Address)

object Person {
  
}

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {
  implicit val ordBook: Ord[Book] = new Ord[Book] {
    override def lt(x: Book, y: Book): Boolean = x.basePrice < y.basePrice
  }
}

object Data {

  val books = List(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )

  val people = List(
    Person("mushtaq", Address("baner", 123)),
    Person("ajit", Address("pashan", 100))
  )
}
