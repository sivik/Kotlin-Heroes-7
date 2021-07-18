import java.math.RoundingMode

fun main() {

    var t = readInt()
    while (t > 0) {
        val (a, b, k) = readLn().split(" ").map { it.toInt() }
        val isEven = isEven(k)
        when {
            a - b == 0 && isEven -> println(0)
            a - b == 0 && !isEven -> println(a)

            else -> {
                val d = k / 2
                if (isEven) {
                    println(
                        a.toBigDecimal().setScale(
                            0,
                            RoundingMode.DOWN
                        ) * d.toBigDecimal() - b.toBigDecimal().setScale(0, RoundingMode.DOWN) * d.toBigDecimal()
                    )
                } else {
                    println(
                        a.toBigDecimal().setScale(
                            0,
                            RoundingMode.DOWN
                        ) * ((d + 1).toBigDecimal()) - b.toBigDecimal().setScale(
                            0,
                            RoundingMode.DOWN
                        ) * d.toBigDecimal()
                    )
                }
            }
        }
        t--
    }
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun isEven(x: Int) = x % 2 == 0
