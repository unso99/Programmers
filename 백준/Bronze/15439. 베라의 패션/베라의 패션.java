import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(nC2(n)));
        bw.flush();
        br.close();
        bw.close();


    }

    static int nC2(int n) {
        return n * (n-1);
    }
}
