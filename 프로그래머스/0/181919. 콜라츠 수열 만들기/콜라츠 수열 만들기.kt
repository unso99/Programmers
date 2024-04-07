class Solution {
    fun solution(n: Int): IntArray {
        val list = mutableListOf<Int>()
        var num = n
        list.add(num)
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2
            }else {
                num = 3 * num + 1
            }
            list.add(num)
        }

        return list.toIntArray()
    }
}