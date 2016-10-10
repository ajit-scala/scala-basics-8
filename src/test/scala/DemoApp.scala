
object DemoApp extends App {

  import scala.collection.immutable._
  import java.nio.file.Paths
  import reftree.Diagram

  val diagram = Diagram(
    defaultOptions = Diagram.Options(density = 100),
    defaultDirectory = Paths.get("/", "tmp")
  )

  val list1 = List(1, 2, 3, 4)
  val list2 = 500 :: list1.tail.tail

  diagram.render("lists")(list1, list2)

  val top1 = B("asdasd", A(100))

  diagram.render("case class")(top1)

}

case class A(a: Int)
case class B(b: String, x: A)
