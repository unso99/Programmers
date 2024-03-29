class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        val list = numlist.filter { it % n == 0 }

        return list.toIntArray()
    }
}