enum class Currency(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "")
}

fun findByName(name: String): String {
    for (country in Currency.values()) {
        if (name == country.country) return country.currency
    }
    return Currency.NULL.currency
}

fun main() {
    // put your code here
    val(c1, c2) = readln().split(" ")
    println(findByName(c1) == findByName(c2))
}