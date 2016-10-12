package sorting

trait Ord[T] {
  def lt(x: T, y: T): Boolean
}

object Ord {

  def apply[T](implicit ord: Ord[T]): Ord[T] = ord

  implicit val intOrd: Ord[Int] = new Ord[Int] {
    override def lt(x: Int, y: Int): Boolean = x < y
  }

  implicit val strOrd: Ord[String] = new Ord[String] {
    override def lt(x: String, y: String): Boolean = x < y
  }

  implicit def optOrd[T](implicit ord: Ord[T]): Ord[Option[T]] = new Ord[Option[T]] {
    override def lt(x: Option[T], y: Option[T]): Boolean = (x, y) match {
      case (None, _)          => true
      case (_, None)          => false
      case (Some(a), Some(b)) => ord.lt(a, b)
    }
  }

  implicit def tupleOrd[T1, T2](implicit ord1: Ord[T1], ord2: Ord[T2]): Ord[(T1, T2)] = new Ord[(T1, T2)] {
    override def lt(x: (T1, T2), y: (T1, T2)): Boolean = {
      if(ord1.lt(x._1, y._1)) true
      else if(ord1.lt(y._1, x._1)) false
      else ord2.lt(x._2, y._2)
    }
  }

}
