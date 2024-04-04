class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        if(is_prefix.length > my_string.length) return 0
        for(i in 0 until is_prefix.length){
            if(is_prefix[i] != my_string[i]) {
                return 0
            }
        }

        return 1
    }
}