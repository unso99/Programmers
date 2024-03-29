class Solution {
    fun solution(num: Int): Int {
        var input = num.toLong()
        var count = 0
        while (input != 1.toLong()) {
            input = job(input)
            count++
            if(count == 500) return -1
        }

        return count

    }

    fun job(num: Long): Long {
        return if (num % 2 == 0.toLong()) {
            num / 2
        } else num * 3 + 1
    }
}