
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int num : map.keySet()) {
			list.add(num);
		}
		
		list.sort(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		
		for(int result : list) {
			System.out.print(result + " ");
		}
	}
}
