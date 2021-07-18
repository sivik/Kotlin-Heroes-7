fun main() {
    var t = readInt()
    while (t > 0) {
        val (a, b, c) = readLn().split(" ").map { it.toInt() }
        println(a + b)
        t--
    }
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()