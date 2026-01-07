import java.util.Scanner;

public class ForPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {// or for(int i=1;i<=n/2;i++);
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Sqaure");
        }
        sc.close();
    }
}
