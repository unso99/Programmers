class Solution {
    fun solution(hp: Int): Int {
        val a = hp / 5
        val b = (hp % 5) / 3
        val c = (hp % 5) % 3
        
        return a + b + c
    }
}