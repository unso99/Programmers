class Solution {
    fun solution(cipher: String, code: Int): String {
        val answer = cipher.filterIndexed { index, _ -> (index +1) % code == 0  }
        return answer
    }
}