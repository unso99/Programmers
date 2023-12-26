class Solution {
    private var max = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        val isVisited = BooleanArray(dungeons.size) { false }
        for(i in dungeons.indices) {
            if(k >= dungeons[i][0]) dfs(i,k,1,isVisited,dungeons)
        }
        return max
    }

    fun dfs(current: Int, k: Int, depth: Int, isVisited : BooleanArray, dungeons: Array<IntArray>) {
        isVisited[current] = true
        val minusK = k - dungeons[current][1]
        for(i in dungeons.indices) if(!isVisited[i] && minusK >= dungeons[i][0]) dfs(i,minusK,depth+1,isVisited,dungeons)
        max = Math.max(max,depth)
        isVisited[current] = false
    }
}