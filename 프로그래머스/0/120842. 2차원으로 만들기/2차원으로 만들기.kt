class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val arr = Array(num_list.size /n,{IntArray(n,{0})})
        for(i in 0 until num_list.size/n){
            for(j in 0 until n) {
                arr[i][j] = num_list[i*n+j]
            }
        }
        return arr
    }
}