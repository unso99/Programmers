class Solution {
    fun solution(num_list: IntArray): Int {
        num_list.forEachIndexed{ index, it ->
            if(it < 0) {
                return index
            }
        }
        return -1
    }
}