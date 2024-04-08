class Solution {
    fun solution(n: Int): Array<IntArray> {
        val list = Array(n,{IntArray(n,{0})})
        for(i in 0 until n) {
            list[i][i] = 1
        }
        
        return list
    }
}