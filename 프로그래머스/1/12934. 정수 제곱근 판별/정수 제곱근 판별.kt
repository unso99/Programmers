class Solution {
    fun solution(n: Long): Long {
        val sqrt = Math.sqrt(n.toDouble()).toInt()
        return if(sqrt * sqrt == n.toInt()) {
            (sqrt+1).toLong() * (sqrt + 1)
        }else -1
    }
}