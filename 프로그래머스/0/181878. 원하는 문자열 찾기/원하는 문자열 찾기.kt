class Solution {
    fun solution(myString: String, pat: String): Int {
        val a = myString.lowercase()
        val b = pat.lowercase()
        return if(a.contains(b)) 1 else 0
    }
}