fun main() {
    // write your code here
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()

    val result: String = if (a + b > c && a + c > b && b + c > a) {
        "YES"
    } else {
        "NO"
    }

    println(result)
}