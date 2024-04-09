class Solution {
    fun solution(n: Int): Int {
        var count = 1
        
        while(count * 6 % n != 0) {
            count++
        }
        
        return count
    }
}