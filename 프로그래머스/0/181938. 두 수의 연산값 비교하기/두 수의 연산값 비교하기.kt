class Solution {
    fun solution(a: Int, b: Int): Int {
        val tmp1 = (a.toString() + b.toString()).toInt()
        val tmp2 = 2 * a * b
        return if(tmp1 >= tmp2) tmp1 else tmp2
    }
}