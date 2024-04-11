class Solution {
    fun solution(n: Int): Int {
        var result = 1
        var count = 0
        while(n >= result) {
            count++
            result = factoriar(count)

        }

        return count -1
    }

    fun factoriar(num : Int) : Int{
        if(num <= 1) {
            return num
        }

        return factoriar(num -1 ) * num
    }
}