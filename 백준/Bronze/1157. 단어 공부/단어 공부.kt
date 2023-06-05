import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    val upstr = str.uppercase()
    val map = mutableMapOf<Char, Int>()
    upstr.forEach {
        if (map.containsKey(it)){
            map[it] = map[it]!!.plus(1)
        }else {
            map.set(it,1)
        }
    }

    val max = map.maxByOrNull { it.value }
    if (map.filter { it.value == max!!.value }.count() > 1){
        println("?")
    }
    else{
        println(max!!.key)
    }


}