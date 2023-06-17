fun main(args: Array<String>) {
    val num =-7

    val result = when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
    println(result)
}
