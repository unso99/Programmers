import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val arr = mutableListOf<Int>()
    val st = StringTokenizer(br.readLine())
    for (i in 0 until n){
        arr.add(Integer.parseInt(st.nextToken()))
    }
    val max = arr.max()
    val min = arr.min()
    print("$min $max")
}