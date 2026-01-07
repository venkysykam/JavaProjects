import java.util.Scanner;
import java.lang.Math;

public class WhileArmstrongNumberNthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int sum = 0;
        int r = 0;
        int temp = n;
        int comp = temp;
        while (n > 0) {
            n = n / 10;
            p++;
        }
        while (0 < temp) {
            r = temp % 10;
            sum = (int) (sum + Math.pow(r, p));
            temp = temp / 10;
        }
        System.out.println(sum);
        if (comp == sum) {
            System.out.println("It is Armstrong");
        } else {
            System.out.println("It is not a Armstrong");
        }
        sc.close();
    }
}
