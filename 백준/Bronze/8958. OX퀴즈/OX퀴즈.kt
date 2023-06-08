import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = Integer.parseInt(br.readLine())

    for (i in 0 until t) {
        val str = br.readLine()
        var isBackO = false
        var sum = 0
        var score = 0
        for (i in 0 until str.length){

            if (str[i] == 'O'){
                if (isBackO) {
                    score += 1
                }else{
                    isBackO = true
                    score = 1
                }
            }else if(str[i] == 'X'){
                isBackO = false
                score = 0
            }
            sum += score
        }
        println(sum)
    }
}