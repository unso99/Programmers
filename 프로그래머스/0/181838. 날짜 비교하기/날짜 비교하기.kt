class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        return if(date1.joinToString("").toInt() < date2.joinToString("").toInt()) 1 else 0
    }
}