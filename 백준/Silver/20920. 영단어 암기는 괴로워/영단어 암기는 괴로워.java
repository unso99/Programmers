import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        Map<String,Integer> wordMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if(word.length() >= m) {
                if (wordMap.containsKey(word)) {
                    wordMap.replace(word,wordMap.get(word) + 1);
                }else {
                    wordMap.put(word,1);
                }
            }
        }

        List<String> wordList = wordMap.keySet().stream().collect(Collectors.toList());

        wordList.sort(((o1, o2) -> {
            int c1 = wordMap.get(o1);
            int c2 = wordMap.get(o2);

            if (c1 == c2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return c2 - c1;
        }));

        for (String word:wordList) {
            bw.write(word + "\n");
        }



        bw.flush();
        br.close();
        bw.close();



    }
}
