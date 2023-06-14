import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.text.DecimalFormat

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val l = Integer.parseInt(br.readLine())
    val str = br.readLine()

    val hashMap = HashMap<Char, Int>()

    for (i in 'a'..'z') {
        val key = i
        val value = i - 'a' + 1
        hashMap[key] = value
    }
    var sum: BigDecimal = BigDecimal.ZERO
    for (i in str.indices) {
        val a = str[i]
        val value = hashMap.get(a)
        val num = value?.times(Math.pow(31.0, i.toDouble()))?.toBigDecimal()
        if (num != null) {
            sum += num
        }
    }
    val formatter = DecimalFormat("###0")
    val result = formatter.format(sum)

    println(result)


}