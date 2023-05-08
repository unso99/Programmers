import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
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


    }

    static class Queue{
        static int[] queue = new int[10001];
        static int first = 0;
        static int last = 0;

        public Queue(){

        }

        public static void push(int x){
            queue[last] = x;
            last++;
        }

        public static void pop() {
            if (last - first == 0) {
                System.out.println("-1");
            }else {
                int p = queue[first];
                first++;
                System.out.println(p);
            }
        }

        public static void size() {
            int num = last - first;
            System.out.println(num);
        }

        public static void empty() {
            if (last - first == 0) {
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }

        public static void front() {
            if (last - first == 0) {
                System.out.println("-1");
            }else {
                int p = queue[first];
                System.out.println(p);
            }
        }

        public  static void back() {
            if (last - first == 0) {
                System.out.println("-1");
            }else {
                int p = queue[last-1];
                System.out.println(p);
            }
        }
    }
}
