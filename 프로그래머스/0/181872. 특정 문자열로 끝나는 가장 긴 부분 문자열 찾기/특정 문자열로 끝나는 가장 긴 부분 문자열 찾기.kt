class Solution {
    fun solution(myString: String, pat: String): String {
        var result = ""
        for(i in myString.length - 1 downTo pat.length - 1) {
            val sub = myString.slice(i - pat.length + 1 .. i)
            if(sub == pat) {
                result =myString.slice(0..i)
                break
            }
            
        }

        return result
    }
}