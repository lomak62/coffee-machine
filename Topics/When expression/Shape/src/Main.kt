fun main(args: Array<String>) {
    // write your code here
    val num = readln().toInt()

    val shape = when (num) {
        1 -> "a square"
        2 -> "a circle"
        3 -> "a triangle"
        4 -> "a rhombus"
        else -> ""
    }

    println(if (shape.isNotEmpty()) "You have chosen $shape" else "There is no such shape!")
}