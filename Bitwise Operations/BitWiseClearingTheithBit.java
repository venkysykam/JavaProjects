import java.util.Scanner;

public class BitWiseClearingTheithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        int bit = a & (~(1 << i));
        System.out.println(bit);
        sc.close();
    }
}
