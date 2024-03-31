class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val list = mutableListOf<String>()
        for(i in 0 until my_string.length) {
            list.add(my_string.slice(i until my_string.length))
        }
        return if(list.contains(is_suffix))1 else 0 
    }
}