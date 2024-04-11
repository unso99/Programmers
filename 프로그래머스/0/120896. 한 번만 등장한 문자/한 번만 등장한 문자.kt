class Solution {
    fun solution(s: String): String {
        val set = s.toSet()
        val list = mutableListOf<Char>()
        
        set.forEach { ch ->
            val count = s.count { it == ch }
            if(count == 1) {
                list.add(ch)
            }
        }
        
        list.sort()
        return list.joinToString("")
    }
}