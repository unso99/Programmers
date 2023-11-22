class Solution {
    fun solution(s: String): IntArray {
        var answer = mutableListOf<Int>()
        val numbers = s.substring(2,s.length-2).split("},{").sortedBy { it.length }

        numbers.forEach{number ->
            number.split(",").forEach{
                if(!answer.contains(it.toInt())){
                    answer.add(it.toInt())
                }
            }
        }
        return answer.toIntArray()
    }
}