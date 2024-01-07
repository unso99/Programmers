class Solution {
    val max = Integer.MAX_VALUE
    fun solution(x: Int, y: Int, n: Int): Int {
        var answer: Int = 0

        val dp = IntArray(y + 1)

        for (i in x + 1 until y+1) {
            var a = max
            var b = max
            var c = max
            var d = 0

            if (isDivided(i, 2) && isExceed(x, i / 2)) a = dp[i / 2]
            if (isDivided(i, 3) && isExceed(x, i / 3)) b = dp[i / 3]
            if (isExceed(x, i - n)) c = dp[i - n]

            d = Math.min(a, b)
            d = Math.min(d, c)

            dp[i] = if (d < max) d + 1 else max

        }
        answer = if(dp[y] < max) dp[y] else -1
        return answer
    }

    fun isExceed(x: Int, num: Int) = num >= x

    fun isDivided(num: Int, divide: Int) = (num / divide > 0 && num % divide == 0)
}