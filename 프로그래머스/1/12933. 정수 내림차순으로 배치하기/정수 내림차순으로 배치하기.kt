class Solution {
    fun solution(n: Long): Long {
        var result = ""
        val arr = n.toString().toCharArray().map{it.toString()}.sortedDescending()
        arr.forEach { 
            result+=it
        }
        return result.toLong()
    }
}