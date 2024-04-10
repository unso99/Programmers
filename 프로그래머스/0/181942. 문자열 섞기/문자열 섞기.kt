class Solution {
    fun solution(str1: String, str2: String): String {
        var result = ""
        for(i in 0 until str1.length){
            result += str1[i]
            result += str2[i]
        }
        
        return result
    }
}