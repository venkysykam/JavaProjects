import java.util.Scanner;

public class ForToFindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expo = sc.nextInt();
        int base = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= base; i++) {
            power = power * expo;
        }
        System.out.println(power);
        sc.close();
    }
}
