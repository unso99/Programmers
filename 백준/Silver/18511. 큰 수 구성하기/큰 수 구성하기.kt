import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.Arrays
import java.util.StringTokenizer


object BOJ_18511_큰수구성하기_Main {
    private lateinit var num: IntArray
    private var N = 0
    private var K = 0
    private var ans = 0
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        var st = StringTokenizer(br.readLine(), " ")
        N = st.nextToken().toInt()
        K = st.nextToken().toInt()
        st = StringTokenizer(br.readLine(), " ")
        num = IntArray(K)
        for (i in 0 until K) {
            num[i] = st.nextToken().toInt()
        }
        Arrays.sort(num)
        dfs(0)
        println(ans)
    }

    private fun dfs(now: Int) {
        if (now > N) return
        if (ans < now) ans = now
        for (i in K - 1 downTo -1 + 1) {
            dfs(now * 10 + num[i])
        }
    }
}