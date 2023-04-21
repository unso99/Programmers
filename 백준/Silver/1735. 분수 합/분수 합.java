import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aUp = Integer.parseInt(st.nextToken());
        int aDown = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int bUp = Integer.parseInt(st.nextToken());
        int bDown = Integer.parseInt(st.nextToken());

        int sumUp = aUp * bDown + aDown * bUp;
        int sumDown = aDown * bDown;

        int mod = greatestCommonFactor(sumUp, sumDown);

        sumUp /= mod;
        sumDown /= mod;



        bw.write(String.valueOf(sumUp) + " " + String.valueOf(sumDown));

        bw.flush();
        br.close();
        bw.close();


    }

    static int greatestCommonFactor(int x, int y) {
        int a;
        int b;
        if (x >= y) {
            a = x;
            b = y;
        }else {
            a = y;
            b = x;
        }

        if (b == 0) {
            return a;
        }else {
            return greatestCommonFactor(b, a % b);
        }
    }
}
