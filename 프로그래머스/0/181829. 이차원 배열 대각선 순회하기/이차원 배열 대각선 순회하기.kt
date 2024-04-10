class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var result = 0
        
        for(i in 0 until board.size) {
            for(j in 0 until board[i].size) {
                if(i + j <= k) {
                    result += board[i][j]
                }
            }
        }
        return result
    }
}