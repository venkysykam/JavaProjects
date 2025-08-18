import java.util.Scanner;

public class ArrayEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " - is Even");
            } else {
                System.out.println(a[i] + " - is Odd");
            }
        }
        sc.close();
    }
}
