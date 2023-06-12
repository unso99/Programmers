import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())

    val arr = mutableListOf<Long>()
    var i :Long = 1
    while(arr.size < n){
        val str: String = i.toString()
        if (str.contains("666")){
            arr.add(i)
        }
        i++
    }

    println(arr.get(n-1))
}