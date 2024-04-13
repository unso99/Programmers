class Solution {
    fun solution(s: String): String {
        val length = s.length
        return if(length % 2 != 0) {
                s[length/ 2].toString()
            }else {
                s.slice(length/2 - 1..length / 2)
            
        }
    }
}