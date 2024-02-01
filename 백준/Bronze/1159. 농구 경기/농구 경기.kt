import java.io.*
import java.util.*

fun main(args:Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val N = br.readLine().toInt()
    
    val map = HashMap<Char,Int>()
    
    for(i in 0 until N){
        val first = br.readLine().get(0)
        map[first] = map.getOrDefault(first,0) + 1
    }
    
    var answer = ""
    map.keys.forEach{
        if(map[it]!! >= 5) answer += it
    }
    
    if(answer == "") println("PREDAJA")
    else println(answer)
}