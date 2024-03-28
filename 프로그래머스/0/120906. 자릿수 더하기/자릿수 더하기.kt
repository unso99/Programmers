class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val str = n.toString().map{it.toString()}
        str.forEach{
            answer += it.toInt()
        }
        return answer
    }
}