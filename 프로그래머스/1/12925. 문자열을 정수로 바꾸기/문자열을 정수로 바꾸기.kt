class Solution {
    fun solution(s: String): Int {
        val str = s.replace("+","")
        return str.toInt()
    }
}