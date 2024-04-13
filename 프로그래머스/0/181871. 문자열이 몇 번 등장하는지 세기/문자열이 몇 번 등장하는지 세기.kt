class Solution {
    fun solution(myString: String, pat: String): Int {
        var count = 0
        val size = myString.length - pat.length
        if(size < 0) return 0
        if(size == 0) {
            return if(myString == pat) 1 else 0
        }
        for(i in 0 ..  size) {
            val sub = myString.slice(i until  i+pat.length)
            println(sub)
            if(sub == pat) count++
        }

        return count
    }
}