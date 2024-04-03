class Solution {
    fun solution(n: Int): Int {
        return if(n % 2 == 1) ((n+1) / 2) * ((n+1) / 2) else (n/2) * (n/2 + 1) * (n + 1) / 6 * 4
    }
}