class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        val arr = sides.sorted()
        answer = if(arr[0] + arr[1] > arr[2]) 1
        else 2
        return answer
    }
}