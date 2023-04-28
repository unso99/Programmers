import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> divisorList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) {
            divisorList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(divisorList);

        int result;
        if (divisorList.size() == 1) {
            result = divisorList.get(0) * divisorList.get(0);
        } else {
            result = divisorList.get(0) * divisorList.get(divisorList.size()-1);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}
