import kotlin.math.pow

fun calculateCompoundInterest(amount: Int, percent: Double, years: Double): Double {
    return amount * (1 + percent / 100).pow(years)
}

fun main() {
    // write your code here
    var amount = 1000
    var percent = 5.0
    var years = 10.0

    val parName = readln()
    val parValue = readln()
    when (parName) {
        "amount" -> amount = parValue.toInt()
        "percent" -> percent = parValue.toDouble()
        "years" -> years = parValue.toDouble()
    }

    println(calculateCompoundInterest(amount, percent, years).toInt())
}