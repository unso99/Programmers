class Solution {
    fun solution(x: Int): Boolean {
        val div = x.toString().toCharArray().map { it.toString().toInt() }.sum()
        return x % div == 0
    }
}