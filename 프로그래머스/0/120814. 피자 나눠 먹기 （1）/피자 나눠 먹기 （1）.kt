class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val a = n / 7
        val b = n % 7
        answer = if(b != 0) a +1
        else a
        return answer
    }
}