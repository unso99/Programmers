class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        val a = n / slice
        val b = n % slice
        answer = if(b != 0) a +1
        else a
        return answer
    }
}