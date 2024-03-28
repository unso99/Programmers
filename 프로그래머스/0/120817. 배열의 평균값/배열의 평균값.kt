class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum = 0;
        numbers.forEach {
            sum += it
        }
        answer = sum.toDouble() / numbers.size
        return answer
    }
}