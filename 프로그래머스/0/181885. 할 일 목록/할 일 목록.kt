class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val list = mutableListOf<String>()
        
        for(i in 0 until finished.size){
            if(!finished[i]) {
                list.add(todo_list[i])
            }
        }
        
        return list.toTypedArray()
    }
}