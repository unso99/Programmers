import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "size":
                    queue.size();
                    break;
                case "empty":
                    queue.empty();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
            }
        }
        System.out.println(sb);

    }

    static class Queue{

        static int[] queue = new int[2000000];
        static int first = 0;
        static int last = 0;
        public Queue(){}

        public static void push(int x) {
            queue[last] = x;
            last++;
        }

        public static void pop() throws IOException {
            if (last - first == 0) {
                sb.append(-1).append("\n");
            }else {
                int q = queue[first];
                first++;
                sb.append(q).append("\n");
            }
        }

        public static void size() throws IOException {
            sb.append(last - first).append("\n");
        }

        public static void empty() throws IOException {
            if (last - first == 0) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }

        public static void front() throws IOException {
            if (last - first == 0) {
                sb.append(-1).append("\n");
            }else {
                int q = queue[first];
                sb.append(q).append("\n");
            }
        }

        public static void  back() throws IOException {
            if (last - first == 0){
                sb.append(-1).append("\n");
            }else {
                int q = queue[last-1];
                sb.append(q).append("\n");
            }
        }
    }
}
