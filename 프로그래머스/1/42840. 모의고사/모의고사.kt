class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val size = answers.size
        val a = intArrayOf(1,2,3,4,5) //5
        val b = intArrayOf(2,1,2,3,2,4,2,5) //8
        val c = intArrayOf(3,3,1,1,2,2,4,4,5,5) //10
        var aCount = 0
        var bCount = 0
        var cCount = 0
        for (i in 1 .. size) {
            val index = if(i % a.size != 0) i % a.size - 1
            else a.size -1
            if(a[index] == answers[i-1]) aCount++
        }
        for (i in 1 .. size) {
            val index = if(i % b.size != 0) i % b.size - 1
            else b.size -1
            if(b[index] == answers[i-1]) bCount++
        }
        for (i in 1 .. size) {
            val index = if(i % c.size != 0) i % c.size - 1
            else c.size -1
            if(c[index] == answers[i-1]) cCount++
        }
        val max = Math.max(Math.max(aCount,bCount),cCount)
        if(aCount == max) answer.add(1)
        if(bCount == max) answer.add(2)
        if(cCount == max) answer.add(3)
        return answer.toIntArray()
    }
}