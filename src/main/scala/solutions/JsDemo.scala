package solutions

import play.api.libs.json._

object JsDemo {

  def transform(jsValue: JsValue): JsValue = jsValue match {
    case JsNumber(value)                             => JsNumber(value * value)
    case b@JsBoolean(value)                          => b
    case JsNull                                      => JsString("empty")
    case JsString(value) if value.startsWith("urn:") => JsString(value.replaceFirst("^urn:", "Hello "))
    case JsArray(values)                             => JsArray(values.map(transform))
    case JsObject(values)                            =>
      val values1 = values.map {
        case (k@("m" | "n"), v) => (k, v)
        case (k, v)             => (k, transform(v))
      }
      JsObject(values1)
    case asdasd                                      => asdasd
  }

}
