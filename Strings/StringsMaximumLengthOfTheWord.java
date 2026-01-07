import java.util.Scanner;

public class StringsMaximumLengthOfTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = 0;
        int max = 0;
        String s = "";
        String b[] = a.split(" ");
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i].length() < b[i + 1].length()) {
                max = b[i + 1].length();
                s = b[i + 1];
            }
        }
        System.out.println(max);
        System.out.println(s);
        sc.close();
    }
}
// 2nd Model
// import java.util.*;

// public class StringsMaximumLengthOfTheWord {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.nextLine();
// int max = Integer.MIN_VALUE;
// String s = "";
// String b[] = a.split(" ");
// for (String string : b) {
// if (max < string.length()) {
// max = string.length();
// s = string;
// }
// }
// System.out.println(max);
// System.out.println(s);
// sc.close();
// }
// }
