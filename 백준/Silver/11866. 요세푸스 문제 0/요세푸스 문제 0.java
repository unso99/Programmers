import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int count = 0;
        sb.append("<");

        while (queue.size() != 0) {
            count++;
            if (count % k != 0) {
                int num = queue.poll();
                queue.add(num);
            } else {
                if (queue.size() == 1) {
                    int num = queue.poll();
                    sb.append(num);
                }else {
                    int num = queue.poll();
                    sb.append(num + ", ");
                }

            }
        }
        sb.append(">");
        System.out.println(sb);




    }
}
