import java.util.Scanner;

public class ArrayMultiplicationWithoutSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int mul = 1;
        for (int i = 0; i < s; i++) {
            mul = mul * a[i];
        }
        for (int i = 0; i < s; i++) {
            a[i] = mul / a[i];
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
// 2nd Method
// import java.util.*;

// public class ArrayMultiplicationWithoutSelf {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int s = sc.nextInt();
// int[] a = new int[s];
// int[] newArr = new int[s];
// int k = 0;
// for (int i = 0; i < s; i++) {
// a[i] = sc.nextInt();
// }
// int mul = 1;
// for (int i = 0; i < s; i++) {
// mul = mul * a[i];
// }
// for (int i = 0; i < s; i++) {
// newArr[k++] = mul / a[i];
// }
// for (int i = 0; i < k; i++) {
// System.out.print(newArr[i] + " ");
// }
// sc.close();
// }
// }
