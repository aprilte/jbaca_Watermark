fun main() {
    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    // write your code here
    var newArray: Array<Array<String>> = arrayOf()
    for (i in inputArray.lastIndex downTo 0) {
        newArray += inputArray[i]
    }
//    println(newArray.contentDeepToString())
    var ansArray: Array<Array<String>> = arrayOf()
    ansArray += inputArray.last()
    ansArray += inputArray.first()
    println(ansArray.contentDeepToString())
}