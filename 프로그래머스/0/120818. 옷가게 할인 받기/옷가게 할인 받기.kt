class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        answer = when(price) {
            in 10 until 100000 -> {
                price
            }
            in 100000 until 300000 -> {
                (price * 0.95).toInt()
            }
            in 300000 until 500000 -> {
                (price * 0.9).toInt()
            }
            else -> {
                (price * 0.8).toInt()
            }
        }
        return answer
    }
}