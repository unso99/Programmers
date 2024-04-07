class Solution {
    fun solution(box: IntArray, n: Int): Int {
        var result = 1
        
        box.forEach { 
            result *= it / n
        }
        
        return result
    }
}