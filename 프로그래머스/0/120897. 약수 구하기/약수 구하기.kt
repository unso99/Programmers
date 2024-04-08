class Solution {
    fun solution(n: Int): IntArray {
        val list = mutableListOf<Int>()
        
        for(i in 1 .. n) {
            if(n % i == 0) {
                list.add(i)
            }
        }
        
        return list.toIntArray()
    }
}