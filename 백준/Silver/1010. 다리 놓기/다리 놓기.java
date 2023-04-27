import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            bw.write(nCr(m,n) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();



    }

    static BigInteger nCr(int n, int r) {
        int nMinusr = n - r;

        BigInteger nProduct = BigInteger.ONE;
        for (int i = n; i > r; i--) {
            nProduct = nProduct.multiply(new BigInteger(String.valueOf(i)));
        }
        BigInteger rProduct = BigInteger.ONE;
        for (int i = nMinusr; i >= 1; i--) {
            rProduct = rProduct.multiply(new BigInteger(String.valueOf(i)));
        }
        if (n == r || n == nMinusr) {
            return BigInteger.ONE;
        }else {
            return nProduct.divide(rProduct);
        }
    }
}
