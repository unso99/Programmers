import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key,0)+1);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key,0)+1);
        }
        Map<String, Integer> sortedMap = new TreeMap<>(map);

        Set<Map.Entry<String,Integer>> entrySet = sortedMap.entrySet();
        int count = 0;

        for (Map.Entry<String,Integer> entry : entrySet){
            if (entry.getValue().equals(2)) {
                count++;
            }
        }

        bw.write(count + "\n");
        for (Map.Entry<String,Integer> entry : entrySet){
            if (entry.getValue().equals(2)) {
                bw.write(entry.getKey()+ "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
