import kotlin.math.log2
import kotlin.math.pow

class Solution {
    fun solution(arr: IntArray): IntArray {
        var a = log2(arr.size.toDouble())
        if(a.toInt() < a) {
           a = (a.toInt() + 1).toDouble()
        }
        val list = mutableListOf<Int>()
        arr.forEach {
            list.add(it)
        }
        val count = 2.0.pow(a.toInt()) - arr.size
        repeat(count.toInt()) {
            list.add(0)
        }

        return list.toIntArray()
    }
}