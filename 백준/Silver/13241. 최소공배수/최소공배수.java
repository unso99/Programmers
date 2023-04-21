import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long result = a * b / greatestCommonFactor(a,b);

        bw.write(String.valueOf(result));



        bw.flush();
        br.close();
        bw.close();
    }

    static int greatestCommonFactor(long x, long y) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                xSet.add(i);
            }
        }
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                ySet.add(i);
            }
        }
        int maxFactor = 0;
        for (int factor : xSet) {
            if (ySet.contains(factor)) {
                if (maxFactor <= factor ) {
                    maxFactor = factor;
                }
            }
        }

        return maxFactor;
    }
}
