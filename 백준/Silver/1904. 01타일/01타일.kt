import java.io.*
import java.util.*

fun main(args : Array<String>){
    val N = readLine()!!.toInt()
    
    val arr = Array(1000001){0}
    
    arr[1] = 1
    arr[2] = 2
    
    for(i in 3..N){
        arr[i] = (arr[i-1] + arr[i-2]) % 15746
    }
    
    println(arr[N])
}

