import java.util.Scanner;

public class ArrayRemoveDuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        int[] res = new int[s];
        int k = 0;
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < s; i++) {
            boolean b = false;// int b=0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    b = true;// b++;
                }
            }
            if (b) {// if(b==1)
                continue;
            } else {
                res[k++] = a[i];
            }
        }
        for (int l = 0; l < k; l++) {
            System.out.print(res[l] + " ");
        }
        sc.close();
    }
}
// 2nd Way
// import java.util.*;

// public class ArrayRemoveDuplicateNumbers {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int s = sc.nextInt();
// int[] a = new int[s];
// int[] res = new int[s];
// int k = 0;
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();
// }
// for (int i = 0; i < a.length; i++) {
// boolean b = false;// b=0;
// for (int j = 0; j < k; j++) {
// if (a[i] == res[j]) {
// b = true;// b++;
// }
// }
// if (b) {// if(b==1)
// continue;
// } else {
// res[k++] = a[i];
// }
// }
// for (int l = 0; l < k; l++) {
// System.out.print(res[l] + " ");
// }
// sc.close();
// }
// }
