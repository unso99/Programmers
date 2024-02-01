import java.io.*
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val arr = br.readLine()
    
    val reverse = arr.reversed()
    
    if(arr == reverse){
        println(1)
    }else{
        println(0)
    }
}