import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());
            long result = 2;
            if (num >= 0 && num <= 2) {
                bw.write(result + "\n");
            }else {
                for (long j = num; j >= num; j++){
                    if (isPrime(j)) {
                        result = j;
                        bw.write(result + "\n");
                        break;
                    }
                }
            }

        }

        bw.flush();
        br.close();
        bw.flush();

    }

    static boolean isPrime(long x) {
        boolean isPrime = true;

        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
