fun main() {
    // write your code here
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()
    val num5 = readln().toInt()

    val range1 = num1..num2
    val range2 = num3..num4

    println(num5 in range1 || num5 in range2)
}