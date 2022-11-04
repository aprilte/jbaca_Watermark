fun main() {
    // put your code here
    val arr = Array(2) { rowIdx -> Array(3) { colIdx -> "[$rowIdx][$colIdx]" } }
    println(arr.contentDeepToString())
}