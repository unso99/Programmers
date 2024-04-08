import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        return if(a == b && b == c) {
            (a+b+c) *(a*a+b*b+c*c)*(a.toFloat().pow(3) + b.toFloat().pow(3) + c.toFloat().pow(3)).toInt()
        }else if(a != b && b != c && c != a) {
            a+b+c
        }else {
            (a+b+c)*(a*a+b*b+c*c)
        }
    }
}