import java.util.Scanner;

public class WhileBouncingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = 0;
        int r2 = 0;
        int t = n;
        int a = t;
        int d = 0;
        int c = 0;
        int p = 0;
        // boolean inc=false;
        // boolean dec=false
        while (a > 9) {
            a = a / 10;
            p++;
        }
        while (n > 9) {
            r1 = n % 10;
            r2 = (n % 100) / 10;
            if (r1 > r2) {
                // inc=true;
                c++;
            }
            n = n / 10;
        }
        while (t > 9) {
            r1 = t % 10;
            r2 = (t % 100) / 10;
            if (r1 < r2) {
                // dec=true;
                d++;
            }
            t = t / 10;
        }
        if (c == p) {
            System.out.println("Increment");
        } else if (d == p) {
            System.out.println("Decrement");
        } else {
            System.out.println("Bouncy Number");
        }
        sc.close();
    }
}
