class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val arr = indices.sortedDescending()
        val str = my_string.toCharArray()
        for(i in 0 until  arr.size) {
            str[indices[i]] = ' '
        }
        
        return str.joinToString("").replace(" ","")
    }
}