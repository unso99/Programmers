class Solution {
    fun solution(array: IntArray): Int {
        var count = 0
        
        array.forEach { num ->
            count += num.toString().toCharArray().count { it == '7' }
        }
        
        return count
    }
}