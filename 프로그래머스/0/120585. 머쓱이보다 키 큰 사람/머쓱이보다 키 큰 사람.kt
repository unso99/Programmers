class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        val arr = array.filter{ it > height}
        answer = arr.size
        return answer
    }
}