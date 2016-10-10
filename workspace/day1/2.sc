

def square(x: Int): Int = x * x


square(10)

val squareF: Int => Int = { x =>
  x * x
}

squareF(10)
squareF.apply(10)


val x: Int => Int = squareF
val x2: Int => Int = square(_)

val x3 = square _
val x4 = square(_)




