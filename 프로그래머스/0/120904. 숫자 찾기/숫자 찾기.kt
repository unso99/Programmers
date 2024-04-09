class Solution {
    fun solution(num: Int, k: Int): Int {
        val arr = num.toString().map { it.toString().toInt() }
        for(i in 0 until arr.size) {
            if(arr[i] == k) return i+1
        }
        
        return -1
    }
}