
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String result = "";
		
		for(char c : s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			}
			
			if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			}
		}
		System.out.println(result);
	}	
}
