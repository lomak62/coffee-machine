import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        println(next)
    }
}