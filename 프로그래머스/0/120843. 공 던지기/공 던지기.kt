class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        return if((2*k-1) % numbers.size == 0) {
            numbers[numbers.size - 1]
        }else {
            (2*k-1) % numbers.size
        }    
    }
}