import java.text.SimpleDateFormat

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        val list = mutableMapOf<String, String>()
        val result = mutableMapOf<String, Int>()
        for (i in records.indices) {
            val record = records[i].split(" ")
            if (record[2] == "IN") {
                list[record[1]] = record[0]
            } else {
                val entrance = list[record[1]]
                list.remove(record[1])
                val exit = record[0]
                result[record[1]] = result.getOrDefault(record[1], 0) + calculateTime(entrance!!, exit)
            }
        }

        if (list.isNotEmpty()) {
            list.forEach {
                result[it.key] = result.getOrDefault(it.key, 0) + calculateTime(it.value, "23:59")
            }
        }

        val sortedResult = result.toSortedMap(compareBy { it })

        sortedResult.forEach {
            answer.add(getResult(fees[0], fees[1], fees[2], fees[3], it.value))
        }

        return answer.toIntArray()
    }

    private fun calculateTime(entrance: String, exit: String): Int {
        val format = SimpleDateFormat("HH:mm")
        val entranceTime = format.parse(entrance)
        val exitTime = format.parse(exit)

        val diffInMillis = exitTime.time - entranceTime.time

        return (diffInMillis / (1000 * 60)).toInt()
    }

    private fun getResult(defaultTime: Int, defaultFee: Int, timeUnit: Int, feeUnit: Int, totalTime: Int): Int {
        if (totalTime <= defaultTime) return defaultFee
        return if ((totalTime - defaultTime) % timeUnit == 0) {
            defaultFee + (totalTime - defaultTime) / timeUnit * feeUnit
        } else {
            defaultFee + (((totalTime - defaultTime) / timeUnit) + 1) * feeUnit
        }

    }
}
