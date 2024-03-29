class Solution {
    fun solution(numbers: IntArray): Int {
        var total = 45
        numbers.forEach {
            total -= it
        }

        return total
    }
}