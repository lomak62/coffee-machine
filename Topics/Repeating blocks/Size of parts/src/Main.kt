fun main() {
    // put your code here
    val parts: Int = readln().toInt()
    var perfect: Int = 0
    var larger: Int = 0
    var reject: Int = 0

    repeat(parts) {
        val seq: Int = readln().toInt()

        when {
            seq == 1 -> larger += 1
            seq == -1 -> reject += 1
            else -> perfect += 1
        }
    }

    println("$perfect $larger $reject")
}