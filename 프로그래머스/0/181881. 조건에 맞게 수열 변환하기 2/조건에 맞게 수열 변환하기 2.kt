class Solution {
    fun solution(arr: IntArray): Int {
        var x = update(arr)
        if(arr.contentEquals(x)) {
            return 0
        }
        var xPlusOne = update(x)
        var count = 1
        while(!x.contentEquals(xPlusOne)) {
            x = update(x)
            xPlusOne = update(xPlusOne)
            count++
        }

        return count
    }

    fun update(arr: IntArray): IntArray {
        return arr.map {
            if (it >= 50 && it % 2 == 0) {
                return@map it / 2
            } else if (it < 50 && it % 2 != 0) {
                return@map it * 2 + 1
            } else {
                return@map it
            }
        }.toIntArray()
    }

}

fun main() {
    Solution().solution(intArrayOf(1, 2, 3, 100, 99, 98))
}