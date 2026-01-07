import java.util.Scanner;

public class ArrayFindMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String[] b = a.split(" ");
        long max = Long.parseLong(b[0]);
        for (int i = 1; i < b.length; i++) {
            long val = Long.parseLong(b[i]);
            if (val > max) {
                max = val;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
