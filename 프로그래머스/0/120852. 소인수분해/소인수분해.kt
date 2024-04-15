class Solution {
    fun solution(n: Int): IntArray {
        var result = n
        var count = 2
        val set = mutableSetOf<Int>()
        while (result > 1) {
            if(result % count == 0) {
                set.add(count)
                result /= count
            }else {
                count++
            }
        }

        return set.toIntArray()
    }
}