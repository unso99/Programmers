class Solution {
    fun solution(myString: String): String {
        var result = ""
        myString.map { if(it < 'l') return@map 'l' else return@map it }.forEach {
            result += it
        }

        return result
    }
}