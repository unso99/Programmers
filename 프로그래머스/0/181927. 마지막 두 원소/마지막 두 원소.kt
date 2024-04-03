class Solution {
    fun solution(num_list: IntArray): IntArray {
        val list = mutableListOf<Int>()
        val last = num_list.last()
        val preLast = num_list[num_list.size-2]
        num_list.forEach { 
            list.add(it)
        }
        if(last > preLast) {
            list.add(last - preLast)
        }else {
            list.add(last * 2)
        }
        return list.toIntArray()
    }
}