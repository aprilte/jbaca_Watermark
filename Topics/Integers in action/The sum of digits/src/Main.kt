fun main() {
    // put your code here
    val inData = readln().split("").filter { it != "" }
    var summ: Int = 0
    inData.forEach {
        summ += it.toInt() ?: 0
    }
    println(summ)
}
