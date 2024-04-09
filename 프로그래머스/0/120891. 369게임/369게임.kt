class Solution {
    fun solution(order: Int): Int {
        return order.toString().map { it.toString().toInt() }.count {
            return@count it == 3 || it == 6 || it == 9
        }
        
    }
}