import java.io.*
import java.util.*

fun main(args : Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    //원래 주려했던 돈 - (받은 등수 - 1) => 팁 음수면 0

    val N = br.readLine().toInt()

    var line = IntArray(N,{0})

    for(i in 0 until N){
        line[i] = br.readLine().toInt()
    }
    var answer = 0L
    line.sortedWith(kotlin.Comparator { o1, o2 ->
        o2- o1
    }).apply {
        forEachIndexed{index, it ->
            if(!(it - index <= 0)) answer += it - index
        }
    }

    println(answer)


}