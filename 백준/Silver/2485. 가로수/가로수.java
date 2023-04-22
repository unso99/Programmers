

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> deltaList = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            deltaList.add(list.get(i+1) - list.get(i));
        }
        for (int i = 0; i <= deltaList.size() -2; i++) {
            deltaList.set(i+1,greatestCommonFactor(deltaList.get(i), deltaList.get(i+1)));
        }
        int interval = deltaList.get(deltaList.size()-1);

        int newPlantNum = ((list.get(n-1) - list.get(0)) / interval)+1 - list.size();
        bw.write(String.valueOf(newPlantNum));

        bw.flush();
        br.close();
        bw.close();
    }

    static int greatestCommonFactor(int x, int y) {
        int a;
        int b;
        if (x >= y) {
            a = x;
            b = y;
        }else {
            a = y;
            b = x;
        }

        if (b == 0) {
            return a;
        }else {
            return greatestCommonFactor(b, a % b);
        }
    }
}
