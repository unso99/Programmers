import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val k = Integer.parseInt(st.nextToken())
    val n = Integer.parseInt(st.nextToken())
    val list = Array(k,{0})

    for (i in 0 until k){
        list[i] = Integer.parseInt(br.readLine())
    }
    list.sort()

    var min : Long = 1
    var max : Long = list[k-1].toLong()
    var mid : Long

    while(min <= max){
        mid = (min + max) / 2

        var count : Long = 0

        for (i in 0 until k){
            count += list[i] / mid
        }

        if (count >= n){
            min = mid +1
        }else max = mid - 1
    }
    print(max)
}