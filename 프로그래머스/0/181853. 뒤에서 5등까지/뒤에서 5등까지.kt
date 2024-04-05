class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().subList(0,5).toIntArray()
    }
}