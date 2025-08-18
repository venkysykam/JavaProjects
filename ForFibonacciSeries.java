import java.util.Scanner;

public class ForFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i <= n; i++) { // for(int i=2;i<=n;i++) and for(int i=3;i<=n;i++)
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        // System.out.println(a);
        // and System.out.println(b) or System.out.println(c)
        sc.close();
    }
}
