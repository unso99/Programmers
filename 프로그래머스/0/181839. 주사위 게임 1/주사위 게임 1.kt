class Solution {
    fun solution(a: Int, b: Int): Int {
        return if(a % 2 != 0 && b % 2 != 0) a*a + b*b else if(a % 2 == 0 && b % 2 == 0) Math.abs(a-b).toInt() else 2 * (a+b)
    }
}