class Solution {
    fun solution(array: IntArray): IntArray {
        val result = IntArray(2)
        for(i in 0 until array.size){
            if(result[0] <= array[i]) {
                result[0] = array[i]
                result[1] = i
            }
        }

        return result
    }
}