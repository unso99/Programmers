class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val root = Math.sqrt(n.toDouble()).toInt()
        for(i in 1 .. root) {
            if (n % i == 0) {
                answer++
            }
        }
        answer *= 2
        if(root * root == n) answer -= 1
        return answer
    }
}