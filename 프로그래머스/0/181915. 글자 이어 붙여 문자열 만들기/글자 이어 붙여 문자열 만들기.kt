class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var result = ""
        index_list.forEach { 
            result += my_string.get(it)
        }
        
        return result
    }
}