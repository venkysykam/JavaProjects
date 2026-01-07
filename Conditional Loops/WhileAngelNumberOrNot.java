import java.util.Scanner;

public class WhileAngelNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  How Many Numbers to check: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Number" + i + ": ");
            int a = sc.nextInt();
            int temp = a;
            int lastdigit = temp % 10;
            boolean allsame = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != lastdigit) {
                    allsame = false;
                    break;
                }
                temp = temp / 10;
            }
            if (allsame) {
                System.out.println("Angel Number");
            } else {
                System.out.println("Not a Angel Number");
            }
        }
        sc.close();
    }
}
