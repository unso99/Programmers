import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val set = mutableListOf<String>()

    for (i in 0 until n){
        set.add(br.readLine())
    }
    val sortedSet = set.run {
        this.sortWith(compareBy({ it.length }, { it }))
        this.toSet()
    }
    sortedSet.forEach{
        println(it)
    }
}