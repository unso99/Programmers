import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = Integer.parseInt(br.readLine())

    for (i in 0 until t){
        val st = StringTokenizer(br.readLine())
        val r = Integer.parseInt(st.nextToken())
        val s = st.nextToken()

        for (j in 0 until s.length){
            for (k in 0 until r){
                print(s[j])
            }
        }
        println()
    }
}