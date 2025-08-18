import java.util.Scanner;

public class ArrayFindingPrefixSumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("The Array:");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[s];
        b[0] = a[0];
        for (int i = 1; i < s; i++) {
            b[i] = b[i - 1] + a[i];
        }
        System.out.println("Enter Ranges: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int range = (m == 0) ? b[n] : b[n] - b[m - 1];
        System.out.println(range);
        sc.close();
    }
}
