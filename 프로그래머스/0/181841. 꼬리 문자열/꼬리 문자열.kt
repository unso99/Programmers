class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var result = ""
        str_list.forEach {
            if (!it.contains(ex)) {
                result += it
            }
        }

        return result
    }
}