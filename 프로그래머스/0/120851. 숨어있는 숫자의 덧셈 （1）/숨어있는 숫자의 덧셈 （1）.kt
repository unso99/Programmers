class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val numbers = my_string.replace("[^0-9]".toRegex(),"").map{it.toString().toInt()}
        numbers.forEach {
            answer += it
        }
        return answer
    }
}