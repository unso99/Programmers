import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = Integer.parseInt(br.readLine())

    for (i in n-1 downTo 0){
        for (j in 1..i){
            print(" ")
        }
        for (k in i until n){
            print("*")
        }
        println()
    }
}