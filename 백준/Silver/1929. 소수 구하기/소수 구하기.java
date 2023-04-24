import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] == 0) continue;

            for (int j = 2 * i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = m; i <= n; i++){
            if (arr[i] != 0) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
