class Solution {
    fun solution(n: Int): Int {
        var count = 0
        for(i in 1 .. n) {
            if(isHapsung(i)) count++
        }
        
        return count
    }
    
    fun isHapsung(num : Int) : Boolean{
        var count = 0
        for(i in 1..num){
            if(num % i == 0) {
                count++
            }
            if(count >= 3) return true
        }
        
        return false
    }
}