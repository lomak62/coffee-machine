fun main() {
    // put your code here
    val seq: Int = readln().toInt()
    var pos: Int = 0

    repeat(seq) {
        val num: Int = readln().toInt()

        if (num > 0) {
            pos += 1
        }
    }

    println(pos)
}