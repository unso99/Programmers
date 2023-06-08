import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = Integer.parseInt(br.readLine())

    for (i in 0 until t) {
        val st = StringTokenizer(br.readLine())
        val h = Integer.parseInt(st.nextToken())
        val w = Integer.parseInt(st.nextToken())
        val n = Integer.parseInt(st.nextToken())
        val visitNumber:Int
        if (n % h != 0) {
            visitNumber = ((n /h) + 1) + n %h *100
        }else{
            visitNumber =h *100 + (n / h)
        }
        println(visitNumber)
    }
}