class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var count = 0
        for(a in i .. j) {
            val str = a.toString()
            str.forEach {
                if(it.toString() == k.toString()){
                    count++
                }
            }
        }

        return count
    }
}