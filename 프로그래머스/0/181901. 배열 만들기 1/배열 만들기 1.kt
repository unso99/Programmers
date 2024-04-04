class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val list = mutableListOf<Int>()
        val m = n / k
        for(i in 1 .. m) {
            list.add(i * k)
        }
        
        return list.toIntArray()
    }
}