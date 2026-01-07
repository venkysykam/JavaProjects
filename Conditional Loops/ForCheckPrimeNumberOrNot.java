import java.util.Scanner;

public class ForCheckPrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}
