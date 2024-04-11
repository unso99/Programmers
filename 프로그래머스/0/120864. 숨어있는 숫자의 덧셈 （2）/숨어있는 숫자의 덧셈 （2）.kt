class Solution {
    fun solution(my_string: String): Int {
        val arr = my_string.replace("[^0-9]".toRegex(), ".").split(".")
            .filter { it != "" }
            .map {
            it.toInt()
        }
        var result = 0
        arr.forEach {
            result += it
        }

        return  result


    }
}