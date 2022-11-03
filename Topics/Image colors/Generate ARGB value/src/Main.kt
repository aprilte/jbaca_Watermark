fun printARGB() {
    // Write your code here
    val argb = readln().split(" ").map { it.toInt() }
    var argbValS = ""
    argb.forEach {
        if (255 < it || it < 0) {
            println("Invalid input")
            return
        } else {
            argbValS += it.toString(16)
        }
    }
    println(argbValS.toLong(16))
}