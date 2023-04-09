import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        List<String> list = new ArrayList<>();

        Set<Map.Entry<String,String>> entrySet = map.entrySet();


        for(Map.Entry<String,String> entry : entrySet) {
            if (entry.getValue().equals("enter")) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        for (int i = list.size() -1; i >= 0; i--) {
            System.out.println(list.get(i));
        }






    }
}
