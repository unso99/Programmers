class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        for(i in 0 until arr.size){
            if(i >= idx && arr[i] == 1) return i
        }
        
        return -1
    }
}