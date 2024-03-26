class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        val zeroOne = intArrayOf(0,0)
        fun dfs(x : Int, y : Int, size : Int) {
            val isZipable = canZip(arr, x, y, size)
            if(isZipable != -1) {
                zeroOne[isZipable]++
                return
            } 
            
            dfs(x,y,size/2)
            dfs(x,y + size/2,size/2)
            dfs(x + size/2 ,y,size/2)
            dfs(x + size/2 ,y + size/2,size/2)
        }
        dfs(0,0,arr.size)
        return zeroOne
    }
    
    fun canZip(arr: Array<IntArray>, x : Int, y : Int, size : Int) : Int {
        val start = arr[x][y]
        for(i in x until x + size) {
            for(j in y until y + size) {
                if(arr[i][j] != start) return -1
            }
        }
        
        return start
    }
}