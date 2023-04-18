import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
     

        Set<Integer> bSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (Integer a : aSet) {
            if (bSet.contains(a)) {
                continue;
            }else {
                count++;
            }
        }


        for(Integer b : bSet) {
            if (aSet.contains(b)) {
                continue;
            }else {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();

    }
}
