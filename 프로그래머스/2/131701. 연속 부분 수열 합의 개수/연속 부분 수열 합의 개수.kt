class Solution {
    fun solution(elements: IntArray): Int {
        val list = mutableListOf<Int>()
        
        val extendedElements = elements + elements
        
        for(i in 0 until elements.size){
            var value = elements[i]
            list.add(value)
            for(j in i + 1 until i + elements.size){
                value += extendedElements[j]
                list.add(value)
            }
        }
        
        return list.toSet().size
    }
}