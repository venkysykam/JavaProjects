import java.util.Scanner;

public class ForNNumbersAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Numbers: ");
        int n = sc.nextInt();
        double Average = 0;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Number" + i + ": ");
            double a = sc.nextDouble();
            sum = sum + a;
        }
        Average = sum / n;
        System.out.println("Average: " + Average);
        sc.close();
    }
}
