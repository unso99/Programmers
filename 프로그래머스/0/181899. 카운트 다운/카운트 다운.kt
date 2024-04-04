class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        val list = mutableListOf<Int>()
        for(i in start downTo end_num) {
            list.add(i)
        }
        
        return list.toIntArray()
    }
}