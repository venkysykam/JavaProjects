import java.util.Scanner;

public class StringsCountLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = 0;
        for (int i = a.trim().length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            if (ch == ' ') {
                break;
            } else {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
