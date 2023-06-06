import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = Integer.parseInt(br.readLine())
    val b = Integer.parseInt(br.readLine())
    val c = Integer.parseInt(br.readLine())
    val abc = a *b * c
    val str = abc.toString()
    var array = Array(10,{0})

    for (i in 0 until str.length){
        val n : Int = str[i] - '0'
        array[n] += 1
    }

    array.forEach {
        println(it)
    }

}