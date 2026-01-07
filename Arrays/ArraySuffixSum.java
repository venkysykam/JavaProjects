import java.util.Scanner;

public class ArraySuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[s];
        b[s - 1] = a[s - 1];
        for (int i = s - 2; i >= 0; i--) {
            b[i] = b[i + 1] + a[i];
        }
        for (int i = 0; i < s; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
// 2nd Method
// import java.util.Scanner;

// public class ArraySuffixSum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String[] n = s.split(" ");
// int[] a = new int[n.length];
// for (int i = 0; i < n.length; i++) {
// a[i] = Integer.parseInt(n[i]);
// }
// int[] b = new int[n.length];
// b[n.length - 1] = a[n.length - 1];
// for (int i = n.length - 2; i >= 0; i--) {
// b[i] = b[i + 1] + a[i];
// }
// for (int i = 0; i < n.length; i++) {
// System.out.print(b[i] + " ");
// }
// sc.close();
// }
// }