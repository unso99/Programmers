class Solution {
    fun solution(num_list: IntArray): IntArray {
        val list = num_list.sorted().subList(5,num_list.size)
        return list.toIntArray()
    }
}