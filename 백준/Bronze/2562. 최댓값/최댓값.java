import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		for(int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n > max) {
				max = n;
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}
}
