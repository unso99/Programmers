import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int index = 0;

        while(st.hasMoreTokens()) {
            origin[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int[] sorted = origin.clone();

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num,rank);
                rank++;
            }
        }

        for (int num : origin) {
            bw.write(map.get(num) + " ");
        }

        bw.flush();
        br.close();
        bw.close();




    }
}
