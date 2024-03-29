class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val list = mutableListOf<Int>()
        arr.forEach {
            if (it % divisor == 0) {
                list.add(it)
            }
        }
        list.sort()
        if (list.isEmpty()) list.add(-1)
        
        return list.toIntArray()

    }
}