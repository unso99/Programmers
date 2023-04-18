import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        Set<String> set = new HashSet<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() -i; j++) {
                set.add(s.substring(j,j+count));
            }count++;
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        br.close();
        bw.flush();
    }
}
