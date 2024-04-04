class Solution {
    fun solution(names: Array<String>): Array<String> {
        return names.filterIndexed{index, s ->
            (index +1) % 5 == 1
        }.toTypedArray()
    }
}