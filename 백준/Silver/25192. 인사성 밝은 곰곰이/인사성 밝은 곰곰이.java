import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Set<String> chatSet = new HashSet<>();

        int count = 1;
        int sum = 0;
        while (count <= n) {
            String chat = br.readLine();
            chatSet.add(chat);

            if (chatSet.contains("ENTER")) {
                sum += chatSet.size() -1;
                chatSet.clear();
            }
            if (count == n) {
                sum += chatSet.size();
            }
            count++;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
