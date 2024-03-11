fun main(args: Array<String>) {
    val T = readln().toInt()

    for (i in 0 until T) {
        var n = readln().toInt()
        var str = ""
        while (n > 1) {
            str = (n % 2).toString() + str
            n /= 2
        }
        str = "1$str"

        for (j in str.length - 1 downTo 0) {
            if (str[j] == '1') {
                print("${str.length - 1 - j} ")
            }
        }
    }
}