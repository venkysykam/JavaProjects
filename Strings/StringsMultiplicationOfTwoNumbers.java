import java.util.Scanner;

public class StringsMultiplicationOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = Integer.valueOf(a);
        int d = Integer.valueOf(b);
        int mul = c * d;
        String e = String.valueOf(mul);
        System.out.println(e);
        sc.close();
    }
}
