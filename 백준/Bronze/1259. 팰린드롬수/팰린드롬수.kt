import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var str = br.readLine()
    while (str != "0"){
        val reversedStr = str.reversed()
        if (str == reversedStr) {
            println("yes")
        }else println("no")
        str = br.readLine()
    }
}