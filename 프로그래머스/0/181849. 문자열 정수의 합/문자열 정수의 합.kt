class Solution {
    fun solution(num_str: String): Int {
        val sum = num_str.map { it.toString().toInt() }.sum()
        return sum
    }
}