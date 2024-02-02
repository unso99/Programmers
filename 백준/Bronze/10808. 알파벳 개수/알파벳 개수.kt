import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val S = br.readLine().toCharArray()
    
    val arr = IntArray(26){0}
    
    for(i in 0 until S.size){
        val num : Int = S[i] - 'a'
        
        arr[num] += 1
    }
    
    arr.forEach{
        print("$it ")
    }
}