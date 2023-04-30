import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        bw.write(String.valueOf(average(list)) + "\n");
        bw.write(String.valueOf(middle(list)) + "\n");
        bw.write(String.valueOf(mode(list)) + "\n");
        bw.write(String.valueOf(range(list)) + "\n");

        bw.flush();
        br.close();
        bw.close();

    }

    static int average(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (int)Math.round(sum / list.size());
    }

    static int middle(List<Integer> list) {
        Collections.sort(list);

        if (list.size() % 2 == 0) {
            return (list.get(list.size()-1) + list.get(list.size())) / 2;
        }else {
            return list.get((int)(list.size() / 2));
        }
    }

    static int mode(List<Integer> list) {
        int[] count = new int[8001];
        int max = 0;
        for (int i =0; i < list.size(); i++) {
            count[list.get(i)+4000]++;
            max = Math.max(count[list.get(i)+4000],max);
        }
        List<Integer> max_index = new ArrayList<>();
        for (int i =0; i <= 8000; i++) {
            if (max == count[i]) {
                max_index.add(i-4000);
            }
        }
        return max_index.size()>1 ? max_index.get(1) : max_index.get(0);
    }

    static int range(List<Integer> list) {
        Collections.sort(list);

        return (list.get(list.size()-1) - list.get(0));
    }
}


