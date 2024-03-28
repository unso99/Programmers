class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothMap = clothes.groupBy{it[1]}.mapValues{it.value.map{it[0]}.toMutableList()}
        clothMap.forEach {
            answer *= it.value.size + 1
        }
        return answer -1
    }
}