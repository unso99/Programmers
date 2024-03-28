class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        val arr = my_string.split("")
        arr.forEach{ str ->
            repeat(n){
                answer += str  
            }
        }
        return answer
    }
}