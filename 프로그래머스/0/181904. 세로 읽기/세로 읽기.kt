
class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        //열에 있는 값을 넣음
        val list = mutableListOf<String>()
        var tmp = ""
        for(i in 0 until my_string.length){
            if(i % m == 0) {
                list.add(tmp)
                tmp = ""
            }
            tmp += my_string[i]
        }
        list.add(tmp)

        var result=""
        list.forEach {
            if(it != ""){
                result += it[c-1].toString()
            }

        }
        return result
    }
}

fun main() {
    Solution().solution("ihrhbakrfpndopljhygc",4,2)
}