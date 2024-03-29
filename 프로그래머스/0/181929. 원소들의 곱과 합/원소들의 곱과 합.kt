class Solution {
    fun solution(num_list: IntArray): Int {
        var x = 1
        num_list.forEach {
            x *= it
        }
        val sum = num_list.sum()
        
        return if(x < sum * sum) 1 else 0
    }
}