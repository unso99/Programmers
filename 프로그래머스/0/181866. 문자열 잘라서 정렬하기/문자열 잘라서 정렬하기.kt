class Solution {
    fun solution(myString: String): Array<String> {
        val list = myString.split("x").filter { it != "" }.sorted()
        return list.toTypedArray()
    }
}