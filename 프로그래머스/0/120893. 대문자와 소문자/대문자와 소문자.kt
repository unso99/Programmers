class Solution {
    fun solution(my_string: String): String {
        var answer = ""
        my_string.toCharArray().forEach {
            if (it.isUpperCase()) {
                answer += it.lowercase()
            } else answer += it.uppercase()
        }
        return answer
    }
}