import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val group = Array(n, { Array(2, { 0 }) })

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        group[i][0] = Integer.parseInt(st.nextToken())
        group[i][1] = Integer.parseInt(st.nextToken())
    }

    val rank = Array(n, { 1 })
    for (i in 0 until group.size) {
        for (j in i until group.size) {
            if (group[i][0] > group[j][0] && group[i][1] > group[j][1]) {
                rank[j] += 1
            } else if (group[i][0] < group[j][0] && group[i][1] < group[j][1]) {
                rank[i] += 1
            }
        }
    }
    rank.forEach { print("$it ") }
}