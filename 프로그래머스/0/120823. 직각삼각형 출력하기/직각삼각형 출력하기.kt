fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    val start = "*"
    for(i in 1 .. n) {
        repeat(i) {
            print(start)
        }
        println()
    }
}