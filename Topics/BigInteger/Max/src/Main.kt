import java.math.BigInteger
fun main() {
    // write your code here
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    var abst: BigInteger = (a - b)
    abst = Math.abs(abst.toLong()).toBigInteger()
    println( (a + b + abst) / BigInteger.TWO)
}