fun f(x: Double): Double {
    // call your implemented functions here
    return when {
        f1(x) != 0.0 -> f1(x)
        f2(x) != 0.0 -> f2(x)
        else -> f3(x)
    }
}

// implement your functions here
fun f1(x: Double): Double {
    return if (x <= 0) x * x + 1 else 0.0
}

fun f2(x: Double): Double {
    return if (x > 0 && x < 1) 1 / (x * x) else 0.0
}

fun f3(x: Double): Double {
    return if (x >= 1) x * x - 1 else 0.0
}
