import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int top;
    static int size;
    static int[] stack;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public Main(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int stackSize = n;
        Main arrStack = new Main(stackSize);

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    arrStack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    arrStack.pop();
                    break;
                case  "size":
                    arrStack.size();
                    break;
                case "empty" :
                    arrStack.empty();
                    break;
                case "top" :
                    arrStack.top();
                    break;
            }
        }

    }

    public static int[] push(int item) {
        stack[++top] = item;
        return stack;
    }
    public static void pop() throws IOException {
        if (top == -1) {
            bw.write("-1");
        }else {
            int pop = stack[top];
            stack[top--] = 0;
            bw.write(String.valueOf(pop));
        }
        bw.write("\n");
        bw.flush();
    }

    public static void size() throws IOException {
        bw.write(String.valueOf(top+1));
        bw.write("\n");
        bw.flush();
    }

    public static void empty() throws IOException {
        if (top == -1) {
            bw.write("1");
        }else {
            bw.write("0");
        }
        bw.write("\n");
        bw.flush();
    }

    public static void top() throws IOException {
        if (top == -1 || stack[top] == 0 ) {
            bw.write("-1");
        }else {
            bw.write(String.valueOf(stack[top]));
        }
        bw.write("\n");
        bw.flush();
    }



}
