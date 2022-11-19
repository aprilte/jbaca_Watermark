fun f(x: Double): Double {
    // call your implemented functions here
    return when {
        x <= 0 -> f1(x)
        0 < x && x < 1 -> f2(x)
        1 <= x -> f3(x)
        else -> 0.0
    }
}

// implement your functions here
fun f1(x: Double): Double = x * x + 1
fun f2(x: Double): Double = 1 / (x * x)
fun f3(x: Double): Double = x * x - 1
