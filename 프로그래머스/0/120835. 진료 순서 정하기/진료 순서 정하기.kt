class Solution {
    fun solution(emergency: IntArray): IntArray {
        val list = mutableListOf<Int>()
        
        val arr = emergency.sortedDescending()
        
        for(i in 0 until emergency.size) {
            for(j in 0 until  arr.size) {
                if(emergency[i] == arr[j]) {
                    list.add(j+1)
                }
            }
        }
        
        return list.toIntArray()
    }
}