import java.io.*
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val T = br.readLine().toInt()

    for(i in 1..T){
        val case = br.readLine().toInt()

        var maxN = 0
        var answer = 0

        for(j in 1..case){
            if(tN(j) >= case){
                maxN = j
                break
            }
        }

        for(a in 1..maxN){
            for(b in 1..maxN){
                for(c in 1..maxN){
                    if(tN(a) + tN(b) + tN(c) == case){
                        answer = 1
                    }
                }
            }
        }

        println(answer)

    }
}

fun tN(x : Int) = x * (x + 1) / 2