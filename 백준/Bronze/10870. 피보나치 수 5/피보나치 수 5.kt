import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val num = fib(n)
    print(num)
}

fun fib(n:Int) = run {
    tailrec fun fib2(n:Int,a:Long,b:Long):Long {
        return when(n ==0){
            true -> b
            false -> fib2(n-1,a+b,a)
        }
    }
    fib2(n,1,0)
}