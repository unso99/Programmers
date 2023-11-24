class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        commands.forEach {
            answer.add(findNumber(array,it[0],it[1],it[2]))
        }

        return answer.toIntArray()
    }
    
    private fun findNumber(arr: IntArray,i:Int, j:Int,k:Int):Int{
        val arrCopy = arr.slice(i-1..j-1)
        return arrCopy.sorted()[k-1]
    }
}