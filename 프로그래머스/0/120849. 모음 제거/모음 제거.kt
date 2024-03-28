class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        answer = my_string.replace("u","").replace("a","").replace("e","").replace("i","").replace("o","")
        return answer
    }
}