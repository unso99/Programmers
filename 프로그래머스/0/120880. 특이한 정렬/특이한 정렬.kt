class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer: IntArray = IntArray(numlist.size) {0}
        val list = ArrayList<Int>()
        for(num in numlist){
            list.add(num)
        }
        
        list.sortWith {o1,o2 ->
            val dif1 = Math.abs(o1 - n)
            val dif2 = Math.abs(o2 - n)
            
            if(dif1 == dif2) {
                o2 - o1
            }else{
                dif1 - dif2
            }
        }
        for(i in 0 until numlist.size){
            answer[i] = list[i]
        }
        return answer
    }
}