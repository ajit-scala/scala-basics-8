


val divide100: Int => Int = divisor => 100/ divisor

val divide100a: Function1[Int, Int] =
  divisor => 100/ divisor

val divide100b: Function1[Int, Int] = {
  case divisor => 100/ divisor
}

val divide100c: Function1[Int, Int] = {
  case divisor if divisor != 0 => 100 / divisor
  case _                       => 0
}

val divide100d: Function1[Int, Int] = {
  case divisor if divisor != 0 => 100 / divisor
}

val divide100e: PartialFunction[Int, Int] = {
  case divisor if divisor != 0 => 100 / divisor
}

val other: PartialFunction[Int, Int] = {
  case 0 => 100
}

divide100e.isDefinedAt(100)
divide100e.isDefinedAt(0)

val pf = divide100e orElse other




