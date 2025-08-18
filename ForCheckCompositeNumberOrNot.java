import java.util.Scanner;

public class ForCheckCompositeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                c++;
                break;
            }
        }
        if (c == 1) {
            System.out.println("Composite Number");
        } else {
            System.out.println("Not a Composite Number");
        }
        sc.close();
    }
}
