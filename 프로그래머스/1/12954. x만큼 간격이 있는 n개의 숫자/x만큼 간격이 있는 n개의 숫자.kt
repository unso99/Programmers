class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val list = mutableListOf<Long>()
        for(i in 0 until n) {
            list.add(x.toLong() * (i+1))
        }
        return list.toLongArray()
        
    }
}