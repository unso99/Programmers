class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        arr.forEach { 
            answer += it
        }
        return answer / arr.size
        
    }
}