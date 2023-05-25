fun main() {
    // write your code here
    val s1 = readln().toString()
    val op = readln().toString()
    val s2 = readln().toString()

    println(
        when (op) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}