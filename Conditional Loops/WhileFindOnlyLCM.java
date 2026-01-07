import java.util.Scanner;

public class FindOnlyLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.min(c, Math.min(a, b));
        sc.close();
        int LCM = 0;
        while (true) {
            if (d % a == 0 && d % b == 0 && d % c == 0) {
                LCM = d;
                break;
            }
            d = d + 1;
        }
        System.out.println(d);
    }
}