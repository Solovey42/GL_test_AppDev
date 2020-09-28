fun main() {
    println("Enter array numbers separated by spaces:")
    val strIn: String? = readLine()
    var strOut = ""
    val array: Array<String?>
    array = strIn?.split(" ")?.toTypedArray()!!
    for (a in array.distinct())
        strOut += "$a "
    println("Output:")
    println(strOut)
}
