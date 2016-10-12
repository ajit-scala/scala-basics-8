package solutions

import play.api.libs.json._

object JsDemo {

  object :: {
    def unapply(email: String) = email.split(":") match {
      case Array(user, domain) => Some((user, domain))
      case _                   => None
    }
  }

  def transform(jsValue: JsValue): JsValue = jsValue match {
    case JsNumber(value)           => JsNumber(value * value)
    case JsBoolean(value)          => JsBoolean(!value)
    case JsNull                    => JsString("empty")
    case JsString("urn" :: suffix) => JsString(s"Hello $suffix")
    case JsArray(values)           => JsArray(values.map(transform))
    case JsObject(values)          =>
      val values1 = values.map {
        case (k@("m" | "n"), v) => (k, v)
        case (k, v)             => (k, transform(v))
      }
      JsObject(values1)
    case asdasd                    => asdasd
  }

}
