import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int nFactorial = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        bw.write(String.valueOf(nFactorial));
        bw.flush();
        br.close();
        bw.close();
    }
}
