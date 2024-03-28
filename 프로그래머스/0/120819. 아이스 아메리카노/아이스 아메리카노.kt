class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        val zan = money / 5500
        val left = money % 5500
        answer[0] = zan
        answer[1] = left
        return answer
    }
}