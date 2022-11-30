fun main() {
    // put your code here
    val (stHH, stMM, stSS) = List(3) { kotlin.io.readln().toInt() }
    val (enHH, enMM, enSS) = List(3) { kotlin.io.readln().toInt() }
    println( calcSec(enHH, enMM, enSS) - calcSec(stHH, stMM, stSS) )
}

fun calcSec(HH: Int, MM: Int, SS: Int): Int {
    return HH*3600 + MM*60 + SS
}
