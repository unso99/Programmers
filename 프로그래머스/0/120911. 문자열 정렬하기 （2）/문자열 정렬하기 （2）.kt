class Solution {
    fun solution(my_string: String): String {
        val result = my_string.lowercase().map { it.toString() }.sorted()
        return result.joinToString("")
    }
}