import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[246913];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i< arr.length; i++) {
            if (arr[i] == 0) continue;

            for (int j = 2 * i; j <arr.length; j +=i) {
                arr[j] = 0;
            }
        }
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            int count = 0;

            for (int i = n+1; i <= 2*n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }

            bw.write(count + "\n");
            n = Integer.parseInt(br.readLine());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
