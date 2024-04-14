class Solution {
    fun solution(bin1: String, bin2: String): String {
        val a = bin1.toInt(2)
        val b = bin2.toInt(2)

        return (a+b).toString(2)

    }
}