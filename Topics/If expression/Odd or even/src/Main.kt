fun main() {
    // write your code here
    val number: Int = readln().toInt()

    val result: String = when {
        number % 2 == 0 -> "EVEN"
        else -> "ODD"
    }

    println(result)
}