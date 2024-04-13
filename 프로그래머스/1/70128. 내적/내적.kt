class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var result  = 0
        
        for(i in 0 until a.size){
            result += a[i] * b[i]
        }
        
        return result
    }
}