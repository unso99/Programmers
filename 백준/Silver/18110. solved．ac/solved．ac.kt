import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val scores = mutableListOf<Int>()
    for (i in 0 until n) {
        scores.add(Integer.parseInt(br.readLine()))
    }
    scores.sort()
    val deleteUnit = (n * 0.15).roundToInt()
    var sum = 0.0
    for (i in deleteUnit until n - deleteUnit) {
        sum += scores[i]
    }
    if (n == 0) {
        print(0)
    } else {
        val result = (sum / (n - deleteUnit * 2)).roundToInt()
        println(result)
    }
}