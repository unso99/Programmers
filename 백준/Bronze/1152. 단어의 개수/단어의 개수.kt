
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`));
    val str = br.readLine()
    val st = StringTokenizer(str)
    val count = st.countTokens()
    println(count)

}