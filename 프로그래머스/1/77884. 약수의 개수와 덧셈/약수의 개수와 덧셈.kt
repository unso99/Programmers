import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0
        
        for(i in left .. right) {
            if(check(i)) {
                result += i
            }else {
                result -= i
            }
        }
        
        return result
    }
    
    fun check(num : Int) : Boolean {
        val a = sqrt(num.toDouble())
        return a.toInt().toDouble() != a
    }
}