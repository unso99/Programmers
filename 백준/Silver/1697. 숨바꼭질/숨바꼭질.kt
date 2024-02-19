import java.util.*

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val N = input[0]
    val K = input[1]

    if (N == K) {
        println(0)
        return
    }

    val visited = BooleanArray(100001, { false })
    visited[N] = true

    val q: Queue<Int> = LinkedList()
    q.add(N)
    var count = 0
    while (true) {
        count++
        val size = q.size
        for (i in 0 until size) {
            val x = q.remove()
            visited[x] = true
            if (x - 1 == K || x + 1 == K || x * 2 == K) {
                println(count)
                return
            }
            if (x - 1 >= 0 && !visited[x - 1]) {
                visited[x - 1] = true
                q.add(x - 1)
            }
            if (x + 1 <= 100000 && !visited[x + 1]) {
                visited[x + 1] = true
                q.add(x + 1)
            }
            if (x * 2 <= 100000 && !visited[x * 2]) {
                visited[x * 2] = true
                q.add(x * 2)
            }
        }
    }
}
