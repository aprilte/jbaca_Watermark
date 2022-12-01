fun main() {
    // write your code here
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val sum = a + b
    val perc = "100".toBigInteger()
    print("${a*perc/sum}% ")
    println("${b*perc/sum}%")
}