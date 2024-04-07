class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val a = my_string[num1]
        val b = my_string[num2]
        val result = my_string.toCharArray()
        result[num1] = b
        result[num2] = a
        return result.joinToString("")
    }
}