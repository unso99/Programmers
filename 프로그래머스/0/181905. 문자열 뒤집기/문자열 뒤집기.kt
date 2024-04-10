class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val a = my_string.slice(0 until s)
        val b = my_string.slice(s until e+1).reversed()
        val c = my_string.slice(e+1 until my_string.length)

        return a+b+c
    }
}