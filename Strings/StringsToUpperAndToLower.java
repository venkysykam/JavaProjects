import java.util.Scanner;

public class StringsToUpperAndToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int lc = 0;
        int uc = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 65 && ch <= 97) {
                lc = ch + 32;
                System.out.print((char) (lc));
            } else {
                uc = ch - 32;
                System.out.print((char) (uc));
            }
        }
        sc.close();
    }
}
// ----2 nd Model
// import java.util.Scanner;

// public class StringsToUpperAndToLower {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.nextLine();
// String b = "";
// for (int i = 0; i < a.length(); i++) {
// char ch = a.charAt(i);
// if (ch >= 65 && ch <= 97) {
// b += (char) ((int) ch + 32);// a=Character.toLowerCase(ch)
// } else {
// b += (char) ((int) ch - 32);// a=Character.UpperCase(ch)
// }
// }
// System.out.print(b);
// sc.close();
// }
// }
