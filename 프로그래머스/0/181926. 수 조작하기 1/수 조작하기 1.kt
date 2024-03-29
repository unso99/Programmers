class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n
        control.forEach{
            answer = job(it,answer)
        }
        return answer
    }
    
    fun job(c : Char, n : Int) : Int {
        return when(c) {
            'w' ->{n+1}
            's' -> {n -1}
            'd' -> {n + 10}
            else -> {n - 10}
        }
    }
}