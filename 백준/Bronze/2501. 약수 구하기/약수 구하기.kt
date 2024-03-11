import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ").map { it.toInt() }
    
    val N = input[0]
    val K = input[1]
    
    val list = mutableListOf<Int>()
    
    for(i in 1..N){
        if(N % i == 0) {
            list.add(i)
        }
    }
    
    if(list.size < K) {
        println(0)
    }else {
        println(list[K-1])
    }
}