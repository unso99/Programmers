class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        val list = mutableListOf<Int>()
        for(i in start_num .. end_num) {
            list.add(i)
        }
        return list.toIntArray()
    }
}