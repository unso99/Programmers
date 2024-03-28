class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        s1.forEach { tmp1 ->
            s2.forEach {tmp2 ->
                if(tmp1 == tmp2) answer++
            }
        }
        return answer
    }
}