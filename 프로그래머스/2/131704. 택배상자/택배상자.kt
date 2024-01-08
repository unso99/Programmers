import java.util.*

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val main = mutableListOf<Int>()
        val sub = Stack<Int>()
        for(i in 1 ..order.size){
            main.add(i)
        }
        var itemIndex = 0
        var orderIndex = 0
        while(itemIndex < order.size && orderIndex < order.size){
            val orderBox = order[orderIndex]
            if(main[itemIndex] == orderBox){
                itemIndex++
                orderIndex++
                answer++

                if(itemIndex == order.size){
                    while(sub.isNotEmpty() && orderIndex < order.size){
                        if(order[orderIndex] == sub.pop()){
                            orderIndex++
                            answer++
                        }
                    }
                }
            }else{
                if(sub.isNotEmpty() && sub.peek() == orderBox){
                    sub.pop()
                    answer++
                    orderIndex++
                }else if(sub.isNotEmpty() && sub.peek() != orderBox){
                    sub.push(main[itemIndex])
                    itemIndex++
                }else{
                    sub.push(main[itemIndex])
                    itemIndex++
                }
            }
        }
        return answer
    }
}