import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val arr = Array(8,{0})

    for (i in 0 until arr.size){
        arr[i] = Integer.parseInt(st.nextToken())
    }

    val ascending = arrayOf(1,2,3,4,5,6,7,8)
    val descending = arrayOf(8,7,6,5,4,3,2,1)
    var isA = 0
    var isD = 0

    for (i in 0 until arr.size) {
        if (arr[i] == ascending[i]){
            isA += 1
        }else if (arr[i] == descending[i]) {
            isD += 1
        }
        
    }

    if (isA == 8) {
        print("ascending")
    }else if (isD == 8) {
        print("descending")
    }else {
        print("mixed")
    }
}