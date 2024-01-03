class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        val map = mutableMapOf<String, String>() //uid 별명
        for (i in record.indices) {
            val s = record[i].split(" ")
            val status = s[0]

            if (status != "Leave") map[s[1]] = s[2]
        }

        for (i in record.indices) {
            val s = record[i].split(" ")
            val status = s[0]
            val uid = s[1]
            if (status == "Enter") answer.add("${map[uid]}님이 들어왔습니다.")

            if (status == "Leave") answer.add("${map[uid]}님이 나갔습니다.")

        }

        return answer.toTypedArray()
    }
}