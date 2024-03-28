class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = IntArray(strlist.size)
        strlist.forEachIndexed { index, it ->
            answer[index] = it.length
        }
        return answer
    }
}