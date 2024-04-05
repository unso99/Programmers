class Solution {
    fun solution(arr: IntArray): IntArray {
        val list = mutableListOf<Int>()

        arr.forEach {num ->
            repeat(num) {
                list.add(num)
            }
        }

        return list.toIntArray()
    }
}