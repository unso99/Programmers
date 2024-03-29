class Solution {
    fun solution(a: Int, b: Int): Long {
        val big = if(a >= b) a else b
        val small = if(a >= b) b else a
        var answer = 0L
        for(i in small .. big) {
            answer += i
        }
        return answer
    }
}