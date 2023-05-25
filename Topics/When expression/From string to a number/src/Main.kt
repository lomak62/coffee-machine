fun main() {
    // write your code here
    val str = readln().toString()

    println(
        when (str) {
            "one" -> 1
            "two" -> 2
            "three" -> 3
            "four" -> 4
            "five" -> 5
            "six" -> 6
            "seven" -> 7
            "eight" -> 8
            "nine" -> 9
            else -> "Type a number from 1 to 9"
        }
    )
}