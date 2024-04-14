class Solution {
    fun solution(myStr: String): Array<String> {
        val list = myStr.split(*arrayOf("a", "b", "c")).filter { it != "" }
        return if (list.isEmpty()) {
            arrayOf("EMPTY")
        } else {
            list.toTypedArray()
        }
    }
}