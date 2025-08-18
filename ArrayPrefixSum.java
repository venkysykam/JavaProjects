import java.util.Scanner;

class ArrayPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[s];
        b[0] = a[0];
        for (int i = 1; i < s; i++) {
            b[i] = b[i - 1] + a[i];
        }
        for (int i = 0; i < s; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
// 2nd Method
// import java.util.Scanner;

// public class ArrayPrefixSum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String[] n = s.split(" ");
// int[] a = new int[n.length];
// for (int i = 0; i < n.length; i++) {
// a[i] = Integer.parseInt(n[i]);
// }
// int[] b = new int[n.length];
// b[0] = a[0];
// for (int i = 1; i < n.length; i++) {
// b[i] = b[i - 1] + a[i];
// }
// for (int i = 0; i < n.length; i++) {
// System.out.print(b[i] + " ");
// }
// sc.close();
// }
// }