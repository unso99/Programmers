class Solution {
    fun solution(before: String, after: String): Int {
        val a = before.toCharArray().sorted().joinToString("")
        val b = after.toCharArray().sorted().joinToString("")
        
        return if(a == b) 1 else 0
        
    }
}