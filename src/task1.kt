fun main(args: Array<String>) {
    println("Введите длинну первой стороны бассейна")
    val n: String? = readLine()
    println("Введите длинну второй стороны бассейна")
    val m = readLine()
    println("Введите расстояние до длинной стороны бассейна")
    val x = readLine()
    println("Введите расстояние до короткой22 стороны бассейна")
    val y = readLine()
    if (n != null) {
        if (m != null) {
            if (x != null) {
                if (y != null) {
                    println("Минимально растояние до бортика: " + compare(n.toInt(), m.toInt(), x.toInt(), y.toInt()))
                }
            }
        }
    }
    fun compare(n: Int, m: Int, x: Int, y: Int) {}
}