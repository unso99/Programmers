import java.io.*
import java.util.*

var N = 0

fun main(args : Array<String>) {
    N = readLine()!!.toInt()
    val hp = readLine()!!.split(" ").map{ it.toInt() }
    val happy = readLine()!!.split(" ").map{ it.toInt() }

    val arr = Array(N,{IntArray(2,{0})})

    for(i in 0 until N){
        arr[i][0] = hp[i]
        arr[i][1] = happy[i]
    }

    print(find(0,0,0,arr))


}

fun find(index : Int, hp : Int, happy : Int ,arr : Array<IntArray>) : Int {
    if(hp >= 100) {
        return 0
    }else if( index == N ) {
        return happy
    }

    var answer = 0

    answer = Math.max(answer, find(index + 1, hp + arr[index][0],happy + arr[index][1], arr))

    answer = Math.max(answer, find(index +1, hp, happy,arr))

    return answer
}


