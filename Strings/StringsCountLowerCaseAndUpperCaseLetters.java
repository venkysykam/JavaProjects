import java.util.Scanner;

public class StringsCountLowerCaseAndUpperCaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int lc = 0;
        int uc = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)) {// if(ch>=65&&ch<=97)
                lc++;
            } else {
                uc++;
            }
        }
        System.out.println("Lower Case Latters Count: " + lc);
        System.out.println("Upper Case Latters Count: " + uc);
        sc.close();
    }
}
