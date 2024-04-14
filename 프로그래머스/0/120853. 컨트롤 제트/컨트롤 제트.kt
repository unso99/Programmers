import java.util.*

class Solution {
    fun solution(s: String): Int {
        val stack = Stack<Int>()

        val arr = s.split(" ")

        arr.forEach {
            if(it == "Z"){
                stack.pop()
            }else {
                stack.push(it.toInt())
            }
        }

        return stack.sum()
    }
}