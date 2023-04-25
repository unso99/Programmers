import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[1000001];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i< arr.length; i++) {
            if (arr[i] == 0) continue;

            for (int j = 2 * i; j <arr.length; j +=i) {
                arr[j] = 0;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());

            bw.write(GoldbachCount(num, arr) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }



    static int GoldbachCount(int x, int[] arr) {
        int count = 0;
        for (int i = 2; i <= x / 2; i++) {
            int a = i;
            int b = x - i;
            if (arr[a] != 0 && arr[b] != 0) {
                count++;
            }
        }
        return count;
    }
}
