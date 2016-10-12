package solutions

sealed trait Day
case object Weekday extends Day
case object Weekend extends Day

sealed trait Customer
case object Regular extends Customer
case object Rewards extends Customer

case class Category(customer: Customer, day: Day)

case class Hotel(name: String, rating: Int, rateCard: Map[Category, Int]) {
  def costOf(bookingRequest: BookingRequest): Int =
    bookingRequest.categories.map(rateCard).sum
}

case class BookingRequest(customer: Customer, days: Seq[Day]) {
  def categories = days.map(day => Category(customer, day))
}

class HotelRepo(hotels: Hotel*) {
  def bestHotel(bookingRequest: BookingRequest): String =
    hotels.minBy(h => (h.costOf(bookingRequest), - h.rating)).name
}
