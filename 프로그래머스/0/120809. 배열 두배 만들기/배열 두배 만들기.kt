class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = numbers.map{it*2}.toIntArray()
        return answer
    }
}