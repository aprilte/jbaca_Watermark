// Implement your functions here
fun subtractTwoNumbers(a: Long, b: Long) {
    print(a - b)
}

fun sumTwoNumbers(a: Long, b: Long) {
    print(a + b)
}

fun divideTwoNumbers(a: Long, b: Long) {
    try {
        print(a / b)
    } catch (ex: ArithmeticException) {
        print("Division by 0!")
    }
}

fun multiplyTwoNumbers(a: Long, b: Long) {
    print(a * b)
}