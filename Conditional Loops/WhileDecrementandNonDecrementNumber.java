import java.util.Scanner;

public class WhileDecrementandNonDecrementNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = 0;
        int r2 = 0;
        int c = 0;
        int temp = n;
        int digit = 0;
        while (n > 9) {
            r1 = n % 10;
            r2 = (n % 100) / 10;
            if (r1 < r2) {
                c++;
            }
            n = n / 10;
        }
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        if (c == digit - 1) {
            System.out.println("Decrement");
        } else {
            System.out.println("Not Decrement");
        }
        sc.close();
    }
}
