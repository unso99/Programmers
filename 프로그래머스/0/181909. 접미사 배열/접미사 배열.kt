class Solution {
    fun solution(my_string: String): Array<String> {
        val list = mutableListOf<String>()

        for(i in 0 until my_string.length ) {
            list.add(my_string.substring(i until my_string.length))
        }

        list.sort()

        return list.toTypedArray()
    }
}