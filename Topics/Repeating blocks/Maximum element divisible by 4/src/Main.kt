fun main() {
    // put your code here
    val seq: Int = readln().toInt()
    var maxNum: Int = 0

    repeat(seq) {
        val num: Int = readln().toInt()

        if (num % 4 == 0 && num > maxNum) {
            maxNum = num
        }
    }

    println(maxNum)
}