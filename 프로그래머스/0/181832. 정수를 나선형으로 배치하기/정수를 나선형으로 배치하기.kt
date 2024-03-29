class Solution {
    fun solution(n: Int): Array<IntArray> {
        val arr = Array(n, { IntArray(n, { 0 }) })
        var num = 1
        var x = 0
        var y = 0
        val dx = intArrayOf(0, 1, 0, -1)
        val dy = intArrayOf(1, 0, -1, 0)
        var direction = 0

        while (num <= n * n) {
            arr[x][y] = num++
            var nx = x + dx[direction]
            var ny = y + dy[direction]

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                direction = (direction + 1) % 4
                nx = x + dx[direction]
                ny = y + dy[direction]
            }
            x = nx
            y = ny
        }

        return arr
    }
}