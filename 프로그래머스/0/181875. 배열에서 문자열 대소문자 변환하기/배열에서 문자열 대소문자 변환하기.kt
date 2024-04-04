class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.mapIndexed { index, s ->
            if(index % 2 !=0) {
                return@mapIndexed s.uppercase()
            }else return@mapIndexed s.lowercase()
        }.toTypedArray()
    }
}