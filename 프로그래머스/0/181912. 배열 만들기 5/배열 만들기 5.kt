class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        val list = mutableListOf<Int>()

        intStrs.forEach {
            val str = it.slice(s until s+l)
            if(str.toInt() > k) list.add(str.toInt())
        }

        return list.toIntArray()
    }
}