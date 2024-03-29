class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val str = n.toString()
        val arr = str.slice(0 until str.length).map { it.toString().toInt() }
        arr.forEach { 
            answer+=it
        }
        return answer
    }
}