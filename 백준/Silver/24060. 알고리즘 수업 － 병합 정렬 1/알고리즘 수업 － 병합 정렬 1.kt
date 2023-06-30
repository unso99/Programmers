import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

lateinit var tmp : Array<Int>
var count = 0
var k:Int = 0
var result = -1
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val arrSize = Integer.parseInt(st.nextToken())
    k = Integer.parseInt(st.nextToken())
    val arr = Array(arrSize,{0})
    tmp = Array(arrSize,{0})
    st = StringTokenizer(br.readLine())
    for (i in 0 until  arrSize){
        arr[i] = Integer.parseInt(st.nextToken())
    }
    mergeSort(arr,0,arrSize-1)
    println(result)
}

fun merge(arr:Array<Int>,p:Int,q:Int,r:Int){
    var i = p
    var j = q+1
    var t = 0
    while(i <= q && j <= r){
        if(arr[i] <= arr[j]){
            tmp[t++] = arr[i++]
        }else{
            tmp[t++] = arr[j++]
        }
    }
    while(i <= q){
        tmp[t++] = arr[i++]
    }
    while(j <=r){
        tmp[t++] = arr[j++]
    }
    i = p
    t = 0
    while(i <=r){
        count++
        if (count == k){
            result = tmp[t]
            break
        }
        arr[i++] = tmp[t++]
    }
}

fun mergeSort(arr:Array<Int>, p:Int, r:Int){
    if (p<r){
        var q = (p+r)/2
        mergeSort(arr,p,q)
        mergeSort(arr,q+1,r)
        merge(arr,p,q,r)
    }
}