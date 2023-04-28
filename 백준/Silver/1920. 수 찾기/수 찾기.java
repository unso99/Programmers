import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> aSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        int[][] mArr = new int[m][2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mArr[i][0] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            if (aSet.contains(mArr[i][0])) {
                mArr[i][1] = 1;
            }
            bw.write(mArr[i][1] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();


    }
}
