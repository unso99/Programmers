class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var result = ""
        
        for(i in 0 until code.length) {
            if(i % q == r) {
                result += code[i]
            }
        }
        
        return result
    }
}