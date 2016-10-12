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

  def optOrd[T](ord: Ord[T]): Ord[Option[T]] = new Ord[Option[T]] {
    override def lt(x: Option[T], y: Option[T]): Boolean = (x, y) match {
      case (None, _)          => true
      case (_, None)          => false
      case (Some(a), Some(b)) => ord.lt(a, b)
    }
  }
}
