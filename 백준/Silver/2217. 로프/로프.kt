fun main(args: Array<String>){
    val N = readLine()!!.toInt()

    val list = mutableListOf<Int>()

    for(i in 0 until N){
        list.add(readLine()!!.toInt())
    }

    list.sortDescending()

    var answer = Int.MIN_VALUE
    //두번 돌기
    for(i in 0 until N){
        answer = Math.max(answer, list[i] * (i + 1))
    }

    println(answer)
}