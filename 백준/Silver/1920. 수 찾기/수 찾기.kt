import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = Integer.parseInt(br.readLine())
    val nList = mutableSetOf<Int>()
    var st = StringTokenizer(br.readLine())
    for (i in 0 until n){
        nList.add(Integer.parseInt(st.nextToken()))
    }
    val m = Integer.parseInt(br.readLine())
    val mList = Array(m,{ Array(2,{0})})
    st = StringTokenizer(br.readLine())
    for (i in 0 until m){
        mList[i][0] = Integer.parseInt(st.nextToken())
    }

    for (i in 0 until m){
        if (nList.contains(mList[i][0])) mList[i][1] = 1
        sb.append("${mList[i][1]}").append("\n")
    }
    println(sb)
}