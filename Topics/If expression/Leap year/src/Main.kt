fun main() {
    // write your code here
    val year: Int = readln().toInt()

    val result: String = if (year % 4 != 0) {
        "Regular"
    } else if (year % 100 != 0) {
        "Leap"
    } else if (year % 400 == 0) {
        "Leap"
    } else {
        "Regular"
    }

    println(result)
}