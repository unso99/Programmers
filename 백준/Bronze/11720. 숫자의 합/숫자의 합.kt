import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val numStr = br.readLine()
    var sum = 0
    for (i in 0 until numStr.length){
        val num = numStr[i] - '0'
        sum += num
    }
    print(sum)
}