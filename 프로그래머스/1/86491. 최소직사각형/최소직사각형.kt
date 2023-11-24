class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int

        var bigIndex1 = -1
        var bigIndex2 = -1
        var maxValue = -1
        var secondValue = -1

        sizes.forEachIndexed { index, arr ->
            if (arr[0] > maxValue) {
                bigIndex1 = index
                bigIndex2 = 0
                maxValue = arr[0]
            }
            if (arr[1] > maxValue) {
                bigIndex1 = index
                bigIndex2 = 1
                maxValue = arr[1]
            }
        }
        sizes.forEachIndexed { index, arr ->
            when (bigIndex2) {
                0 -> {
                    if (index != bigIndex1) {
                        var temp0 = arr[0]
                        var temp1 = arr[1]

                        if (temp0 < temp1) {
                            arr[0] = temp1
                            arr[1] = temp0
                        }
                    }
                }

                else -> {
                    if (index != bigIndex1) {
                        var temp0 = arr[0]
                        var temp1 = arr[1]

                        if (temp0 > temp1) {
                            arr[0] = temp1
                            arr[1] = temp0
                        }
                    }
                }
            }
        }

        sizes.forEach {
            if (bigIndex2 == 0) {
                if (secondValue < it[1]) secondValue = it[1]
            } else {
                if (secondValue < it[0]) secondValue = it[0]
            }

        }

        maxValue = sizes[bigIndex1][bigIndex2]

        answer = maxValue * secondValue


        return answer
    }
}