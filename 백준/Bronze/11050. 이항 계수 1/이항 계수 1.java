import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = factorial(n) / (factorial(k) * factorial(n-k));
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();


    }

    static int factorial (int x) {
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i;
        }
        return  sum;
    }
}
