import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
    var answer = 0
    val deq = ArrayDeque<Process>()
    val target = Process(priorities[location], location)

    priorities.forEachIndexed { index, i ->
        deq.add(Process(i, index))
    }

    while (deq.isNotEmpty()) {
        val first = deq.first()
        if (deq.count { it.priority > first.priority } != 0) {
            deq.addLast(first)
            deq.removeFirst()
        } else {
            if (first == target) break
            else {
                deq.removeFirst()
                answer++
            }
        }
    }

    return answer + 1
}

data class Process(val priority: Int, val location: Int)
}