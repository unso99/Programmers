class Solution {
    fun solution(n: Int): IntArray {


        val dx = intArrayOf(0, 1, -1)
        val dy = intArrayOf(1, 0, -1)

        val triangle = Array(n) { IntArray(n) { 0 } }

        var v = 1
        var x = 0
        var y = 0
        var d = 0

        while (true) {
            triangle[y][x] = v++
            var nx = x + dx[d]
            var ny = y + dy[d]

            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                d = (d + 1) % 3
                nx = x + dx[d]
                ny = y + dy[d]
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break
            }

            x = nx
            y = ny
        }

        var answer = IntArray(v - 1)
        var index = 0
        for (i in 0 until n) {
            for (j in 0..i) {
                answer[index++] = triangle[i][j]
            }
        }



        return answer
    }
}