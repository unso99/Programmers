import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = Integer.parseInt(br.readLine())

    for (i in 0 until t){
        val str = br.readLine()
        val result = isPalindrome(str)
        println("${result.first} ${result.second}")
    }
}

fun recursion(s: String, l: Int, r: Int,count:Int = 1):Pair<Int,Int> {
    return if(l>=r) Pair(1,count)
    else if (s[l] != s[r]) Pair(0,count)
    else recursion(s,l+1,r-1,count+1)
}

fun isPalindrome(s:String):Pair<Int,Int>{
    return recursion(s,0,s.length-1)
}