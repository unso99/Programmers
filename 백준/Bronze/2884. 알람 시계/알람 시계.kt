import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    var h = Integer.parseInt(st.nextToken())
    var m = Integer.parseInt(st.nextToken())

    if (h  > 0 && m >= 45){
        m = m -45
    }else if (h > 0 && m < 45) {
        h = h - 1
        m = m +60 -45
    }else if (h == 0 && m >= 45) {
        m = m -45
    }else if (h == 0 && m < 45) {
        h = 23
        m = m + 60 -45
    }


    println("$h $m")
}