class Solution {
    fun solution(n_str: String): String {
        for(i in 0 until n_str.length){
            if(n_str[i] != '0') {
                return n_str.slice(i until n_str.length)
            }
        }
        return ""
    }
}