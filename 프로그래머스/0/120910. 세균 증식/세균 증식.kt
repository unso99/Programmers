import kotlin.math.pow
class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer: Int = 0
        answer = 2.0.pow(t).toInt() * n
        return answer
    }
}