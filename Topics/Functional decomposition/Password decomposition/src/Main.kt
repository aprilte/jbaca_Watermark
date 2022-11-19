fun validatePassword(password: String): Boolean {
    // write your code here
    val ret = 4 < password.length
    if (ret) {
        println("Good password")
    } else {
        println("Your password should be longer than five characters, please write a new password")
    }
    return ret
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}