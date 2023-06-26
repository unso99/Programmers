import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = Integer.parseInt(st.nextToken())
    val m = Integer.parseInt(st.nextToken())
    val deque = ArrayDeque<Int>()
    val arr = ArrayDeque<Int>()
    st = StringTokenizer(br.readLine())
    for (i in 0 until m) {
        arr.add(Integer.parseInt(st.nextToken()))
    }

    for (i in 0 until n) {
        deque.add(i + 1)
    }
    var count = 0
    for (i in 0 until m) {
        while (deque.first() != arr.first()) {
            if (deque.indexOf(arr.first()) > (deque.size / 2.0)) {
                deque.addFirst(deque.last())
                deque.removeLast()
                count++
            } else {
                deque.addLast(deque.first())
                deque.removeFirst()
                count++
            }
        }
        deque.removeFirst()
        arr.removeFirst()
    }

    print(count)
}