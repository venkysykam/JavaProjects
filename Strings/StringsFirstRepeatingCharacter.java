import java.util.Scanner;

public class StringsFirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            int c = 0;
            if (a.indexOf(ch1) < i) {
                continue;
            }
            for (int j = 0; j < a.length(); j++) {
                char ch2 = a.charAt(j);
                if (ch1 == ch2) {
                    c++;
                }
            }
            if (c > 1) {
                System.out.println(a.charAt(i) + " " + c);
                break;
            }
        }
        sc.close();
    }
}
