import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            if (isPdrm(num)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            num = sc.nextInt();
        }

    }

    static boolean isPdrm(int x) {
        String num = String.valueOf(x);
        int a = 0;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) == num.charAt(num.length()-1 - i)) {
                continue;
            }else {
                a = 1;
                break;
            }
        }

        if (a == 0) {
            return  true;
        }else {
            return  false;
        }
    }
}
