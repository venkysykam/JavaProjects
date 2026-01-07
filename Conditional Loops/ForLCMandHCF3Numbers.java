import java.util.Scanner;

public class ForLCMandHCF3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        // int c=Math.min(a,b);
        int HCF = 0;
        int LCM = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0 && d % i == 0) {
                HCF = i;
            }
        }
        System.out.println(HCF);
        LCM = (a * b * d) / HCF;
        System.out.println(LCM);
        sc.close();
    }
}
