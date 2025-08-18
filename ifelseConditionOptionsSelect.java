import java.util.Scanner;

public class ifelseConditionOptionsSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Check Amount=" + a);
        System.out.println("Deposit=" + b);
        System.out.println("Withdraw=" + c);
        int option = sc.nextInt();
        System.out.println("Select option:" + option);
        {
            if (option == 1) {
                int Check_Amount = a;
                System.out.println("Check Amount= " + Check_Amount);
            } else if (option == 2) {
                int Deposit = b;
                System.out.println("Deposit= " + Deposit);
            } else if (option == 3) {
                int Withdraw = c;
                System.out.println("Withdaraw= " + Withdraw);
            } else {
                System.out.println("Wrong option");
            }
        }
        sc.close();
    }
}
