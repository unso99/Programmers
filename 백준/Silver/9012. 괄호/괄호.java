import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            boolean b = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '(') {
                    stack.push(ch);
                }else if(stack.empty() && ch == ')') {
                    b = false;
                    break;
                }else if(!stack.empty() && ch ==')') {
                    stack.pop();
                }

            }

            if (stack.empty() && b) {
                bw.write("YES\n");
            }else {
                bw.write("NO\n");
            }
            stack.clear();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
