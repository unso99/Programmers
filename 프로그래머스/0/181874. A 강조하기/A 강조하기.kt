class Solution {
    fun solution(myString: String): String {
        val arr =myString.replace("a","A")
        
        var result = ""
        arr.forEach{
            if(it != 'A') {
                result += it.lowercase()
            }else result += it
        }
        
        return result
    }
}