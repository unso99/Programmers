class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val stack = java.util.Stack<Int>()

        for (i in 0 until moves.size) {
            // moves 에 해당하는 것을 꺼낸다
        var doll = 0
        for (j in 0 until board.size) {
            //꺼낸후에는 꺼낸곳의 board는 0으로 바꿔준다
            doll = board[j][moves[i] - 1]
            if (doll != 0) {
                board[j][moves[i]-1] = 0
                break
            }
        }
        //만약 moves에 해당하는 곳에 아무것도 없다면 아무일도 일어나지않는다
        if (doll != 0) {
            //그리고 스택에다가 넣어준다
            if (!stack.isEmpty()) {
                if (stack.peek() == doll) {
                    stack.pop()
                    //이런식으로 하닥 스택에서 가장 최근것과 동일하면 삭제를 시켜주고 count 2를 더해준다
                    answer += 2
                } else {
                    stack.push(doll)
                }
            }
            else {
                stack.push(doll)
            }
        }
    }
    return answer
    }
}