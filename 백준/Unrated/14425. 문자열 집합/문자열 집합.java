import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            stringSet.add(br.readLine());
        }

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            stringList.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (stringSet.contains(stringList.get(i))){
                count++;
            }
        }

        System.out.println(count);
        br.close();

    }
}
