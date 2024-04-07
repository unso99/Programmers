class Solution {
    fun solution(numbers: IntArray): Int {
        var max = Int.MIN_VALUE
        for(i in 0 until numbers.size) {
            for(j in i+1 until numbers.size) {
                val num = numbers[i] * numbers[j]
                if(max <= num) max = num
            }
        }
        return max
    }
}