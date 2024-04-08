class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val cheeze = numbers + numbers
        
        val size = numbers.size
        val list = mutableListOf<Int>()
        if(direction == "right") {
            for(i in size - 1 until 2*size - 1) {
                list.add(cheeze[i])
            }
        }else {
            for(i in 1 until size + 1) {
                list.add(cheeze[i])
            }
        }
        
        return list.toIntArray()
    }
}