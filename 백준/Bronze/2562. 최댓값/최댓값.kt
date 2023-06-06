import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var array = Array(9,{0})

    for (i in 0 until array.size){
        val n = Integer.parseInt(br.readLine())
        array[i] = n
    }

    var max = 0
    var order = 0;
    for (i in 0 until array.size){
        if (array[i] > max){
            max = array[i]
            order = i+1
        }
    }

    println(max)
    println(order)

}