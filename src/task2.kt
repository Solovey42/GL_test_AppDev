fun main() {
    val km = 109
    println("Enter the speed")
    val v: Int? = readLine()?.toInt()
    println("Enter the time")
    val t = readLine()?.toInt()
    val s: Int? = t!! * v!!
    if (s != null) {
        if (s < 0) {
            print(km + s % km)
        }
    }
    if (s != null) {
        if (s > 0) {
            println(s-km*(s/km))
        }
    }
}



