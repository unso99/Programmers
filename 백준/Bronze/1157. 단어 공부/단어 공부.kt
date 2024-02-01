import java.io.*
import java.util.*

fun main(args : Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val arr = br.readLine().uppercase().toCharArray()

    val map = HashMap<Char,Int>()

    for(i in 0 until arr.size){
        map[arr[i]] = map.getOrDefault(arr[i],0) + 1
    }

    var max = Int.MIN_VALUE
    var answer = ""
    map.keys.forEach{
        if(map.get(it)!! > max) {
            max = map.get(it)!!
            answer = it.toString()
        }else if(map.get(it) == max){
            answer = "?"
        }
    }

    println(answer)


}