class Solution {
    fun solution(strArr: Array<String>): Int {
        val map = mutableMapOf<Int, Int>()

        strArr.forEach {
            val size = it.length
            map.put(size, map.getOrDefault(size, 0) + 1)
        }

        var result = 0
        map.keys.forEach {
            if (map[it]!! > result) {
                result = map[it]!!
            }
        }

        return result
    }
}