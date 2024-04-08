class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {

        return arr.copyOfRange(intervals[0][0], intervals[0][1]+1) +
                arr.copyOfRange(intervals[1][0], intervals[1][1]+1)
    }
}