import java.util.Scanner;

public class ArrayCountOfSameNonRepeatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            boolean b = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    b = true;
                }
            }
            if (b) {
                continue;
            }
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
            System.out.println(a[i] + " " + c + " Times Repeating");
        }
        sc.close();
    }
}
