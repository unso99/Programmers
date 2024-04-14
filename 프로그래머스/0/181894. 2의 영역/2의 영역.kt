class Solution {
    fun solution(arr: IntArray): IntArray {
        var start = -1
        var end = -1

        for(i in 0 until arr.size) {
            if(arr[i] == 2) {
                start = i
                break
            }
        }

        for(i in arr.size - 1 downTo 0) {
            if(arr[i] == 2) {
                end = i
                break
            }
        }

        return if(start == -1) {
            intArrayOf(-1)
        }else {
            arr.sliceArray(IntRange(start,end))
        }
    }
}