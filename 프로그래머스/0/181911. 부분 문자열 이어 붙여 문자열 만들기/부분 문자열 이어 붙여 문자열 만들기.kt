class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var result = ""
        for(i in 0 until my_strings.size) {
            result += my_strings[i].substring(parts[i][0] .. parts[i][1])
        }
        
        return result
    }
}