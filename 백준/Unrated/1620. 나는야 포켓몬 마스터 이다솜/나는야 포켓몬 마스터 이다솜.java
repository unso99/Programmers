import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            map.put(str, i+1);
            list.add(str);
        }

        for (int i = 0 ; i < n; i++) {
            String str = br.readLine();
            if (isInteger(str)) {
                bw.write(list.get(Integer.parseInt(str)-1) + "\n");
            }else {
                bw.write(map.get(str) + "\n");
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
    public static boolean isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
