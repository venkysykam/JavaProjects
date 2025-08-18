import java.util.Scanner;

public class ForRangeBetweenPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1 = 0;
        for (int j = 2; j < n; j++) {
            int c = 0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
            if (c == 0) {
                c1++;
                System.out.print(j + " ");
            }
        }
        System.out.println("\nCount of Prime Numbers: " + c1);
        sc.close();
    }
}
