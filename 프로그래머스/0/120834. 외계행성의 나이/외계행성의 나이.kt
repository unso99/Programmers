class Solution {
    fun solution(age: Int): String {
        val str = age.toString().map { it.toString().toInt() }
        var result = ""

        str.forEach {
            result += 'a' + it
        }

        return result
    }
}