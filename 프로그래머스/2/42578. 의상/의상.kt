class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothMap = clothes.groupBy { it[1] }.mapValues { it.value.map { it[0] }.toMutableList() }
        clothMap.forEach {
            println(it)
            answer *= it.value.size+1
        }


        return answer -1
    }
    
    private fun combination(n: Int, r: Int): Int {
        if (n == r || r == 0) return 1
        else return combination(n - 1, r - 1) + combination(n - 1, r)
    } 
    
}