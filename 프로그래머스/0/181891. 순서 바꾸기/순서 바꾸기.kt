class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>()
        for(i in n until num_list.size) {
            list.add(num_list[i])
        }
        
        for(i in 0 until n) {
            list.add(num_list[i])
        }
        
        return list.toIntArray()
    }
}