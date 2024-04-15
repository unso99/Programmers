class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var pay = 0L
        for(i in 1 .. count) {
            pay += price * i
        }
        
        return if(pay > money) {
            (pay - money).toLong()
        }else {
            0
        }
    }
}