class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var diff = Int.MAX_VALUE
        var result = 0
        for(i in 0 until array.size){
            val a = Math.abs(array[i] - n)
            if(diff > a) {
                diff = a
                result = array[i]
            }

            if(diff == a && result > array[i]) {
                result = array[i]
            }



        }

        return result
    }
}