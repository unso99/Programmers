class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var max = 1
        var min = 1
        sizes.forEach {
            val a = if(it[0] >= it[1] ) it[0]
            else it[1]
            val b = if(it[0] >= it[1] ) it[1]
            else it[0]

            if(max <= a) max = a
            if(min <= b) min = b
        }

        answer = max * min

        return answer
    }
}