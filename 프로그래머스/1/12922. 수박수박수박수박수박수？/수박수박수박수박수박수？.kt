class Solution {
    fun solution(n: Int): String {
        var result = ""
        repeat(n){
            result += if((it+1) % 2 != 0) {
                "수"
            }else {
                "박"
            }
        }

        return result
    }
}