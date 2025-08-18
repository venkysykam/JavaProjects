import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(n << 1);
        System.out.println(n << 2);
        System.out.println(n >> 1);
        System.out.println(n >> 2);
        System.out.println(n & a);
        System.out.println(n | a);
        System.out.println(~a);
        sc.close();
    }
}
