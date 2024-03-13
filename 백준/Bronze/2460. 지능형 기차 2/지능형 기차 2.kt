import java.io.*
import java.util.*

fun main(args : Array<String>) {
    var max = 0
    var now = 0

    for(i in 0 .. 9) {
        val list = readln().split(" ").map{it.toInt()}
        val come = list[0]
        val out = list[1]

        now = now - come + out

        if(now > max) max = now
    }

    println(max)
}