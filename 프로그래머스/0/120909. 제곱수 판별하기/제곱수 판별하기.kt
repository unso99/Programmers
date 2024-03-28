class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val root = Math.sqrt(n.toDouble())
        val rootToInt = Math.sqrt(n.toDouble()).toInt().toDouble()
        answer = if(root == rootToInt) 1
        else 2
        return answer
    }
}