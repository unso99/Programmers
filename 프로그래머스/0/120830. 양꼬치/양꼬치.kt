class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val service = n / 10
        answer = n * 12000 + (k - service) * 2000
        return answer
    }
}