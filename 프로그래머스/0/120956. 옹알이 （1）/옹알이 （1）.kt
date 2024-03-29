class Solution {
    fun solution(babbling: Array<String>): Int {
        var count = 0

        babbling.forEach {
            if(check(it))count++
        }

        return count
    }

    fun check(str : String) :Boolean {
        val result = str.replace("aya",",").replace("ye",",")
            .replace("woo",",").replace("ma",",")

        
        return result.replace(",","").isEmpty()
    }
}