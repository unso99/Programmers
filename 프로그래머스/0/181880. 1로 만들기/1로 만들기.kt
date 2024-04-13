class Solution {
    fun solution(num_list: IntArray): Int {
        var count = 0
        
        num_list.forEach { 
            var num = it
            while(num != 1) {
                if(num % 2 == 0) {
                    num /= 2
                }else {
                    num = (num - 1) / 2
                }
                count++
            }
        }
        
        return count
    }
}