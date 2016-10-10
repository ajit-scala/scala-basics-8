
object DemoApp extends App {

  import scala.collection.immutable._
  import java.nio.file.Paths
  import reftree.Diagram

  val diagram = Diagram(
    defaultOptions = Diagram.Options(density = 100),
    defaultDirectory = Paths.get("/", "tmp")
  )

  val list1 = List(1, 2, 3, 4)

  val list2 = 100 :: list1.tail
  val list3 = 10 :: list1.tail.tail

  diagram.render("lists")(list1, list2, list3)
}
