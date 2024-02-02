import java.io.*
import java.util.*

fun main(args : Array<String>) {
    val n = readLine()!!.toInt()
    
    val arr = Array(1001){0}
    
    arr[1] = 1
    arr[2] = 2
    
    for(i in 3..n){
        arr[i] = (arr[i-1] + arr[i-2]) % 10007
    }
    
    println(arr[n])
}