import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val stack = Stack<Int>()
    var start = 0
    var n  = Integer.parseInt(br.readLine())
    while(n-- > 0){
        val num = Integer.parseInt(br.readLine())

        if (num > start){
            for (i in start+1 ..num){
                stack.push(i)
                sb.append("+").append("\n")
            }
            start = num
        }else if(stack.peek() != num){
            println("NO")
            return
        }
        stack.pop()
        sb.append("-").append("\n")
    }
    println(sb)
}