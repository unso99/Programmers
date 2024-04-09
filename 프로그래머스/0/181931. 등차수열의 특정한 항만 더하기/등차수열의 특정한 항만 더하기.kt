class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var result = 0
        for(i in 0 until included.size){
            if(included[i]) {
                result += a + d*i
            }
        }
        
        return result
    }
}