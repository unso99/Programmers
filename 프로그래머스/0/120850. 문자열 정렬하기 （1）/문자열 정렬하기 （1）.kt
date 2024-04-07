class Solution {
    fun solution(my_string: String): IntArray {
        val list = mutableListOf<Int>()
        my_string.forEach {
            if(it in '0'..'9') list.add(it.toString().toInt())
        }

        list.sort()

        return list.toIntArray()
    }
}