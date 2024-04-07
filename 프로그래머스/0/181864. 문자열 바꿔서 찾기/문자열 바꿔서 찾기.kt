class Solution {
    fun solution(myString: String, pat: String): Int {
        val str = myString.map {
            if(it == 'A') return@map 'B'
            else return@map 'A'
        }.joinToString("")

        return if(str.contains(pat)) 1
        else 0
    }
}