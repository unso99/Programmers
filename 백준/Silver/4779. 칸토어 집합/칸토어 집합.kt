import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

lateinit var arr: Array<Char>
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    var str = br.readLine()
    while (str != null) {
        if(str == "")break
        val n = Integer.parseInt(str)
        val size = Math.pow(3.0, n.toDouble()).toInt()
        arr = Array(size) { '-' }
        cantorSet(0, size)

        arr.forEach {
            sb.append(it)
        }
        sb.append("\n")
        str = br.readLine()
    }
    print(sb)

}

fun cantorSet(start: Int, size: Int) {
    if (size < 3) {
        return
    }

    for (i in start + size / 3 until start + (size / 3) * 2) {
        arr[i] = ' '
    }
    cantorSet(start, size / 3)
    cantorSet(start + (size / 3) * 2, size / 3)
}