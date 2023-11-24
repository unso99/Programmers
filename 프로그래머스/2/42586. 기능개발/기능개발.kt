class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = IntArray(100)
        val stack = java.util.Stack<Int>()
        var index = 0
        var day = 0
        for (i in progresses.size - 1 downTo 0) {
            stack.push(progresses[i])
        }

        while (!stack.isEmpty()) {
            if(stack.peek() + day * speeds[index] >= 100){
                stack.pop()
                answer[day] = answer[day] + 1

                index++
            }else{
                day++
            }
        }

        val list = mutableListOf<Int>()
        answer.forEach {
            if(it != 0){
                list.add(it)
            }
        }

        return list.toIntArray()
    }
}