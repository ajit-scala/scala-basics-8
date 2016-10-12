package sorting

trait Ord[T] {
  def lt(x: T, y: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = new Ord[Int] {
    override def lt(x: Int, y: Int): Boolean = x < y
  }

  val strOrd: Ord[String] = new Ord[String] {
    override def lt(x: String, y: String): Boolean = x < y
  }

  val optOrdInt: Ord[Option[Int]] = new Ord[Option[Int]] {
    override def lt(x: Option[Int], y: Option[Int]): Boolean = (x, y) match {
      case (None, _)          => true
      case (_, None)          => false
      case (Some(a), Some(b)) => a < b
    }
  }

  val optOrdString: Ord[Option[String]] = new Ord[Option[String]] {
    override def lt(x: Option[String], y: Option[String]): Boolean = ???
  }

}
