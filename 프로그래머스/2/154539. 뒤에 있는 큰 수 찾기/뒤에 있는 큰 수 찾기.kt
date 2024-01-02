import java.util.PriorityQueue

class Solution {
    fun solution(numbers: IntArray): IntArray {

        val q = PriorityQueue<IntArray>{a,b -> a[1] - b[1]}

        for(i in numbers.indices){
            val value = numbers[i]

            while(!q.isEmpty() && q.peek()[1] < value) numbers[q.poll()[0]] = value

            q.add(intArrayOf(i,value))
        }
        
        while(!q.isEmpty()){
            numbers[q.poll()[0]] = -1
        }

        return numbers
    }
}