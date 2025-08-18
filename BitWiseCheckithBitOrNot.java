import java.util.Scanner;

public class BitWiseCheckithBitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        if ((a & (1 << i)) != 0) {
            System.out.println("Set Bit");
        } else {
            System.out.println("Not Set Bit");
        }
        sc.close();
    }
}
