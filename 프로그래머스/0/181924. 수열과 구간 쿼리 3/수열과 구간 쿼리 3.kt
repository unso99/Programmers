class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { tmp ->
            arr[tmp[0]] = arr[tmp[0]] xor arr[tmp[1]]
            arr[tmp[1]] = arr[tmp[0]] xor arr[tmp[1]]
            arr[tmp[0]] = arr[tmp[0]] xor arr[tmp[1]]
        }

        return arr

    }
}