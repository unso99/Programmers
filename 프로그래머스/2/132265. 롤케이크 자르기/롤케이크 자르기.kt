import java.util.*

class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val a = mutableMapOf<Int,Int>()
        val b = mutableMapOf<Int,Int>()
        for(i in topping.indices){
            b[topping[i]] = b.getOrDefault(topping[i],0) + 1
        }

        for(i in topping.indices){
            a[topping[i]] = a.getOrDefault(topping[i],0) + 1
            b[topping[i]] = b[topping[i]]!! - 1
            if(b[topping[i]] == 0) b.remove(topping[i])
            if(a.size == b.size) answer++

        }

        return answer
    }
}