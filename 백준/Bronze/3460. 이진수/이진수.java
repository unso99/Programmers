import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = "";
            int n = Integer.parseInt(br.readLine());

            while (n > 1) {
                int rest = n % 2;
                n = n / 2;
                str = rest + str;
            }
            str = "1" + str;

            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) == '1') {
                    System.out.print(str.length() - 1 - j + " ");
                }
            }
        }
    }
}