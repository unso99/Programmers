class Solution {
    fun solution(places: Array<Array<String>>): IntArray {
        val answer = mutableListOf<Int>()
        //P 는 사람 O 는 빈테이블 X는 파티션

        for (i in places.indices) {
            //방임
            val room = places[i]

            val nodes = createNodes(room)

            if (checkDistance(nodes)) answer.add(1)
            else answer.add(0)
        }
        return answer.toIntArray()
    }
    
    private fun checkDistance(nodes: List<List<Node>>): Boolean {
        nodes.forEach { nodeList ->
            nodeList.forEach { node ->
                if (!checkNode(node)) return false
            }
        }
        return true
    }
    
    private fun checkNode(node: Node): Boolean {

    if (node.value == "X") return true
    if(node.value == "O"){
        var count = 0
        if((node.top?.value ?: "0") == "P") count++
        if((node.right?.value ?: "0") == "P") count++
        if((node.bottom?.value ?: "0") == "P") count++
        if((node.left?.value ?: "0") == "P") count++
        return count < 2
    }

    //나의 오른쪽, 위, 아래, 옆이 사람이면 false
    return !(((node.top?.value
        ?: "0") == "P" || (node.right?.value ?: "0") == "P" || (node.bottom?.value ?: "0") == "P" || (node.left?.value
        ?: "0") == "P"))
    }
    
    private fun createNodes(room: Array<String>): List<List<Node>> {
    //상하좌우 사이드에 있는 값들은 node를 다 따로 설정해줘야한다.
    val nodes = listOf(
        listOf(Node(), Node(), Node(), Node(), Node()),
        listOf(Node(), Node(), Node(), Node(), Node()),
        listOf(Node(), Node(), Node(), Node(), Node()),
        listOf(Node(), Node(), Node(), Node(), Node()),
        listOf(Node(), Node(), Node(), Node(), Node())
    )
    for (i in room.indices) {
        when (i) {
            0 -> {//첫번째 줄
                for (j in room[i].indices) {
                    nodes[i][j].value = room[i][j].toString()
                    nodes[i][j].bottom = nodes[i + 1][j]
                    if (j == 0) {
                        nodes[i][j].right = nodes[i][j + 1]
                    } else if (j == 4) {
                        nodes[i][j].left = nodes[i][j - 1]
                    } else {
                        nodes[i][j].right = nodes[i][j + 1]
                        nodes[i][j].left = nodes[i][j - 1]
                    }
                }
            }

            4 -> { //마지막 줄
                for (j in room[i].indices) {
                    nodes[i][j].value = room[i][j].toString()
                    nodes[i][j].top = nodes[i - 1][j]
                    if (j == 0) {
                        nodes[i][j].right = nodes[i][j + 1]
                    } else if (j == 4) {
                        nodes[i][j].left = nodes[i][j - 1]
                    } else {
                        nodes[i][j].right = nodes[i][j + 1]
                        nodes[i][j].left = nodes[i][j - 1]
                    }
                }
            }

            else -> {
                for (j in room[i].indices) {
                    nodes[i][j].value = room[i][j].toString()
                    nodes[i][j].top = nodes[i - 1][j]
                    nodes[i][j].bottom = nodes[i + 1][j]
                    if (j == 0) {
                        nodes[i][j].right = nodes[i][j + 1]
                    } else if (j == 4) {
                        nodes[i][j].left = nodes[i][j - 1]
                    } else {
                        nodes[i][j].right = nodes[i][j + 1]
                        nodes[i][j].left = nodes[i][j - 1]
                    }
                }
            }
        }
    }
    return nodes
    }
    
    class Node {
    var top: Node? = null
    var bottom: Node? = null
    var left: Node? = null
    var right: Node? = null
    var value: String? = null

}
}