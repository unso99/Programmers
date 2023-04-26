import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int add = 2;
        int sum = 0;
        for (int i = 1; i>=1; i+=add) {
            if (sum <= 2100000000) {
                sum += i;
                list.add(sum);
            }else {
                break;
            }

        }

        int n = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (n == 1) {
                System.out.println(1);
                break;
            } else {
                if (n <= list.get(i)) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
