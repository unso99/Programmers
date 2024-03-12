import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(min > num) min = num;
            if(max < num) max = num;
        }
        
        System.out.println(min + " " + max);
    }
}