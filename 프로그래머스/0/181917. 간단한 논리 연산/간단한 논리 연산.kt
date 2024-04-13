class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        val a = x1 || x2
        val b = x3 || x4
        return (a && b)
    }

}