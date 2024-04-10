import java.util.Stack

class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val stack = Stack<Int>()

        for(i in 0 until flag.size){
            if(flag[i]){
                repeat(arr[i]*2){
                    stack.add(arr[i])
                }
            }else {
                repeat(arr[i]){
                    stack.pop()
                }
            }
        }

        return stack.toIntArray()
    }
}