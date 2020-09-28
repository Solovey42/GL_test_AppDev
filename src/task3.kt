fun main() {
    println("Введите числа массива через пробел:")
    val strIn: String? = readLine()
    var strOut = ""
    val array: Array<String?>
    array = strIn?.split(" ")?.toTypedArray()!!
    for (a in array.distinct())
        strOut += "$a "
    println("Вывод:")
    println(strOut)
}
