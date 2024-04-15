class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = mutableListOf<Int>()

        var index = 0
        while(index < arr.size) {
            if(stk.isEmpty()) {
                stk.add(arr[index++])
            }else {
                if(stk.last() < arr[index]) {
                    stk.add(arr[index++])
                }else {
                    stk.removeLast()
                }
            }
        }
        
        return stk.toIntArray()
    }
}