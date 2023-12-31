class Solution {
    fun solution(word: String): Int {
        var answer = 0
        val char = charArrayOf('A','E','I','O','U')
        val list = intArrayOf(781,156,31,6,1)
        for(i in word.indices){
            answer += char.indexOf(word[i]) * list[i]
        }
        answer += word.length
        return answer
    }
}