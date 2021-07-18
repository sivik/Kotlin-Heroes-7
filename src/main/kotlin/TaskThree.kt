fun main() {
    var t = readInt()
    while (t > 0) {
        val (n, k) = readLn().split(" ").map { it.toInt() }
        val arr = (1..k).map { alphabet[it]!! }
        val c = n - arr.size
        if (c == 0) {
            println(arr.joinToString(""))
            t--
            continue
        }
        var s = arr.joinToString("")

        var actRev = s.reversed()
        repeat((1 until n / k).count()) {
            s = s.plus(actRev)
            actRev = actRev.reversed()
        }
        s = s.plus(actRev.substring(0, n % k))
        println(s)
        t--
    }
}

val alphabet = hashMapOf(
    1 to "a",
    2 to "b",
    3 to "c",
    4 to "d",
    5 to "e",
    6 to "f",
    7 to "g",
    8 to "h",
    9 to "i",
    10 to "j",
    11 to "k",
    12 to "l",
    13 to "m",
    14 to "n",
    15 to "o",
    16 to "p",
    17 to "q",
    18 to "r",
    19 to "s",
    20 to "t",
    21 to "u",
    22 to "v",
    23 to "w",
    24 to "x",
    25 to "y",
    26 to "z"
)

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

/*
tailrec fun randAgain(lr: Int, k: Int): Int {
    val r = (1..k).random()
    return if (r != lr) r else randAgain(lr, k)
}
*/

