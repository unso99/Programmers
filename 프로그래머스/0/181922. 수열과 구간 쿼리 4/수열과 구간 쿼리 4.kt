class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { list ->
            for(i in list[0] .. list[1]) {
                if(i % list[2] == 0) {
                    arr[i] += 1
                }
            }
        }
        
        return arr
    }
}