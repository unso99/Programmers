class Solution {
    fun solution(rsp: String): String {
        //가위는 2 바위는 0 보는 5
        var answer = ""

        rsp.forEach {
            answer += winCase(it)
        }

        return answer
        
    }

    fun winCase(case: Char): String {
        return when (case) {
            '2' -> {
                "0"
            }

            '0' -> {
                "5"
            }

            else -> {
                "2"
            }
        }
    }
}