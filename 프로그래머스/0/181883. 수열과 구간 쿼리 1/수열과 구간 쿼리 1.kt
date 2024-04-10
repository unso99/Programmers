class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val list = arr
        
        queries.forEach { 
            for(i in it[0] .. it[1]) {
                list[i] += 1
            }
        }
        
        return list
    }
}