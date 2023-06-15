import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = Integer.parseInt(br.readLine())

    var sum = BigDecimal.ONE

    for (i in 1 .. n){
        sum *= i.toBigDecimal()
    }

    val sumToString = sum.toString()
    var count = 0

    for(i in sumToString.length-1 downTo 0){
        if (sumToString[i] == '0'){
            count++
        }
        if (sumToString[i] !='0'){
            break
        }
    }
    println(count)
}