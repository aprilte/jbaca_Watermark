fun main() {
    // put your code here
    val target: Int = readln().toInt()
    var counter: Int = 0
    var partCounter: Int = 0
    var printNum: Int = counter + 1
    while (true) {
        if (counter == target) return
        print("$printNum ")
        counter += 1
        partCounter += 1
        if (partCounter == printNum) {
            printNum += 1
            partCounter = 0
        }
    }
}