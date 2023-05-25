fun validatePassword(password: String): Boolean {
    // write your code here
    val validPassword = password.length >= 5
    if (validPassword) {
        println("Good password")
    } else {
        println("Your password should be five or longer characters, please write a new password")
    }
    return validPassword
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}