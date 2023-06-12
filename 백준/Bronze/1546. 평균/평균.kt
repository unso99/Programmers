import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    var sum:Double = 0.0
    val st = StringTokenizer(br.readLine())
    val list = mutableListOf<Double>()
    for (i in 0 until n){
        list.add(Integer.parseInt(st.nextToken()).toDouble())
    }
    val max = list.max()
    list.replaceAll{
        val value = (it / max) *100
        sum += value
        value
    }
    println(sum / n)
}