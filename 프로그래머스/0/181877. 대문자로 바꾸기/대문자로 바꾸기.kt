class Solution {
    fun solution(myString: String): String {
        var answer = ""
        myString.forEach {
            answer += it.toUpperCase()
        }
        return answer
    }
}