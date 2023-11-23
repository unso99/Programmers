class Solution {
    fun solution(user_id: Array<String>, banned_id: Array<String>): Int {
    var answer = 0
    val visited = BooleanArray(user_id.size) { false }
    val pickedId = mutableListOf<String>()
    val pickedIds = permutation(0, banned_id.size, user_id, visited, pickedId)
    val tempIds = mutableListOf<List<String>>()
    pickedIds.forEach { possibleIds -> //가능한 유저 아이디 순열 조합
        var count = 0
        //밴아이디와 유저아이디 비교
        for (i in banned_id.indices) {
            if (isBanned(banned_id[i], possibleIds[i])) count++
        }
        if (count == banned_id.size) tempIds.add(possibleIds)
    }
    val resultIds = mutableListOf<List<String>>()

    tempIds.forEach {
        resultIds.add(it.sorted())
    }

    answer = resultIds.distinct().size

    return answer
}
//userid로 bannid의 사이즈만큼의 순열을 만들자


private fun isBanned(banId: String, userId: String): Boolean {
    if (banId.length == userId.length) {
        var count = 0
        for (i in banId.indices) {
            if (banId[i] == '*') count++
            else {
                if (banId[i] == userId[i]) count++
            }
        }
        return count == banId.length
    }

    return false
}

private fun permutation(
    count: Int,
    depth: Int,
    list: Array<String>,
    visited: BooleanArray,
    pickedId: MutableList<String>
): List<List<String>> {
    val result = mutableListOf<List<String>>()

    if (count == depth) {
        result.add(ArrayList(pickedId))
        return result
    }

    for (i in list.indices) {
        if (!visited[i]) {
            visited[i] = true
            pickedId.add(list[i])
            result.addAll(permutation(count + 1, depth, list, visited, pickedId))
            pickedId.removeAt(pickedId.lastIndex)
            visited[i] = false
        }
    }

    return result
}
}