import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    val arr = Array(26,{-1})
    for (i in 0 until str.length){
        val ch = str[i] - 'a'
        if (arr[ch] == -1) {
            arr[ch] = i
        }
    }
    arr.forEach {
        print("$it ")
    }
}