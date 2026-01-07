import java.util.Scanner;

public class WhileIncreamentandNonIncreamentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int n = 1234;
        int r1 = 0;
        int r2 = 0;
        int c = 0;
        while (n > 0) {
            r1 = n % 10;
            r2 = (n % 100) / 10;
            if (r1 > r2) {
                // System.out.println("Increment");
                c++;
            }
            n = n / 10;
        }
        if (c == 4) {
            System.out.println("Increment");
        } else {
            System.out.println("Not Increment");
        }
        sc.close();
    }
}
