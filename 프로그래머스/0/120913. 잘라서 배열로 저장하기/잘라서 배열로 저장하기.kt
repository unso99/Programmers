class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val list = mutableListOf<String>()

        for(i in 0 until my_str.length step n) {
            if(i+n >= my_str.length){
                list.add(my_str.slice(i .. my_str.length-1))
            }else {
                list.add(my_str.slice(i until i+n))
                
            }
        }

        return list.toTypedArray()
    }
}