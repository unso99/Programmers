class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val a = n / 2
        val list = mutableListOf<Int>()
        for(i in 1 .. a) {
            list.add(2*i - 1)
        }
        if(n % 2 != 0) {
            list.add(n)
        }
        answer = list.toIntArray()
        return answer
    }
}