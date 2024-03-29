class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val size = num_list.size
        return num_list.slice(n-1 until size).toIntArray()
    }
}