import java.util.Scanner;

public class ArrayCountSameNumbersWithoutSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] & i != j) {
                    c++;
                }
            }
            System.out.println(a[i] + " " + c + " Times Repeating");
        }
        sc.close();
    }
}
