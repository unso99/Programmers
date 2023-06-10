import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = Integer.parseInt(st.nextToken())
    val m = Integer.parseInt(st.nextToken())
    val chessBoard = Array(n,{" "})

    for (i in 0 until chessBoard.size){
        chessBoard[i] = br.readLine()
    }

    val wBoard = Array(8,{Array(8,{'W'})})
    val bBoard = Array(8,{Array(8,{'B'})})

    for ((i,row) in wBoard.withIndex()){
        for((j,column) in row.withIndex()){
            if (i % 2 == 0){
                if (j % 2 == 0){
                    wBoard[i][j] = 'W'
                }else wBoard[i][j] = 'B'
            }else{
                if (j % 2 == 0){
                    wBoard[i][j] = 'B'
                }else wBoard[i][j] = 'W'
            }
        }
    }

    for ((i,row) in bBoard.withIndex()){
        for((j,column) in row.withIndex()){
            if (i % 2 == 0) {
                if(j % 2 == 0){
                    bBoard[i][j] = 'B'
                }else bBoard[i][j] = 'W'
            }else {
                if (j % 2 ==0) {
                    bBoard[i][j] = 'W'
                }else bBoard[i][j] = 'B'
            }
        }
    }

    val selectedBoard = Array(8,{Array(8,{'W'})})

    var min = 1000000000

    for (i in 0 until n - 8+1){
        for (j in 0 until m - 8+1){
            var changeNum1 = 0
            var changeNum2 = 0
            for (row in 0 until 8){
                for (col in 0 until 8){
                    selectedBoard[row][col] = chessBoard[i + row][j + col]
                }
            }

            for (k in 0 until 8){
                for (l in 0 until  8){
                    if (selectedBoard[k][l] != wBoard[k][l]){
                        changeNum1 += 1
                    }
                    if (selectedBoard[k][l] != bBoard[k][l]){
                        changeNum2 += 1
                    }
                }
            }
            if(min > Math.min(changeNum1,changeNum2)) min = Math.min(changeNum1,changeNum2)
        }
    }
    println(min)
}