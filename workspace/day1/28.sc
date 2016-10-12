
object Email {
  def unapply(email: String) = email.split("@") match {
    case Array(user, domain) => Some((user, domain))
    case _                   => None
  }
}

def m(email: String) = email match {
  case Email(user, domain) => s"Hello $user from $domain"
  case _                   => "error"
}

m("mushtaq:tw.com")
m("mushtaq:tw.co@m")
m("mushtaqtw.com")

