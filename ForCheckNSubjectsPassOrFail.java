import java.util.Scanner;

public class ForCheckNSubjectsPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No.of Subjects: ");
        int n = sc.nextInt();
        int passmarks = 35;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Subject " + i + ": ");
            int marks = sc.nextInt();
            if (marks >= passmarks) {
                c++;
                // System.out.println("Pass");
                // }
                // else{
                // System.out.println("Fail");
            }
        }
        if (c == n) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
