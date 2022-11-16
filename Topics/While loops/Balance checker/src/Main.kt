import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        // TODO
        val cost = scanner.next().toInt()
        if (cost <= balance) {
            balance -= cost
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $cost.")
            return
        }
    }
    // TODO
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}