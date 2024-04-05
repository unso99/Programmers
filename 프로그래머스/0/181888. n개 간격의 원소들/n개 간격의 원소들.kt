class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>()
        for(i in 0 until num_list.size step n) {
            list.add(num_list[i])
        }

        return list.toIntArray()
    }
}