import java.io.*
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val S = br.readLine().toCharArray()

    var answer = ""

    for(i in 0 until S.size){
        if(S[i] < 'A') {
            answer += S[i]
        }else if(S[i] >= 'A' && S[i] <= 'Z'){
            if(S[i] + 13 > 'Z'){
                val a = 13 - ('Z' - S[i])
                answer+= 'A' + a - 1
            }else {
                answer += S[i] + 13
            }
        }else if(S[i] >= 'a' && S[i] <= 'z'){
            if(S[i] + 13 > 'z'){
                val a = 13-('z'-S[i])
                answer += 'a' + a -1
            }else{
                answer += S[i] + 13
            }
        }
    }

    println(answer)
}