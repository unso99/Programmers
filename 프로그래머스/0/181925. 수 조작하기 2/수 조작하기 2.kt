class Solution {
    fun solution(numLog: IntArray): String {
        var result = ""
        for(i in 1 until numLog.size) {
            val dif = numLog[i] - numLog[i-1]
            when(dif) {
                1 -> {
                    result += "w"
                }
                -1 -> {
                    result += "s"
                }
                10 -> {
                    result += "d"
                }
                -10 -> {
                    result += "a"
                }
            }
        }
        
        return result
    }
}