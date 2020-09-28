fun main() {
    println("Enter the length of the first side of the pool")
    val n: String? = readLine()
    println("Enter the length of the second side of the pool")
    val m = readLine()
    println("Enter the distance to the long side of the pool")
    val x = readLine()
    println("Enter the distance to the short side of the pool")
    val y = readLine()
    if (n != null) {
        if (m != null) {
            if (x != null) {
                if (y != null) {
                    println("Minimum distance to side: " + compare(
                        n.toInt(),
                        m.toInt(),
                        x.toInt(),
                        y.toInt()
                    )
                    )
                }
            }
        }
    }
}

fun compare(n: Int, m: Int, x: Int, y: Int): Int {
    if (n < m)
        return if (m - y < x)
            m - y
        else x
    return if (n > m)
        if (m - x < y)
            m - x
        else
            y
    else
        0
}
