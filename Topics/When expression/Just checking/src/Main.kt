fun main() {
    // write your code here
    val num = readln().toInt()

    println(
        when (num) {
            2 -> "Yes!"
            in 1..4 -> "No!"
            else -> "Unknown number"
        }
    )
}