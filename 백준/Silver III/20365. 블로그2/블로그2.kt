fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val str = readLine()!!.toCharArray()

    val map = mutableMapOf<Char, Int>()
    map['B'] = 0
    map['R'] = 0

    map[str[0]] = map[str[0]]!! + 1

    for (i in 1 until N) {
        if (str[i] != str[i - 1]) {
            map[str[i]] = map.getOrDefault(str[i], 0) + 1
        }
    }

    var min = Math.min(map['B']!!, map['R']!!)

    println(min + 1)


}