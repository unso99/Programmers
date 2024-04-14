class Solution {
    fun solution(order: Array<String>): Int {
        var total = 0
        
        order.forEach { 
            total += price(it)
        }
        
        return total
    }
    
    fun price(menu : String) : Int {
        return if(menu.contains("americano") || menu.contains("anything")){
            4500
        }else 5000
    }
}