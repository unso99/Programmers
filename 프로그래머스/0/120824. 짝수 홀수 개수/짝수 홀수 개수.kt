class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        val even = num_list.count{ it%2 == 0}
        answer[0] = even
        answer[1] = num_list.size - even
        return answer
    }
}