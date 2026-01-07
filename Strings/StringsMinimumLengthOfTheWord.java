
import java.util.*;

public class StringsMinimumLengthOfTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = 0;
        String b[] = a.split(" ");
        int min = b[0].length();
        String s = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() < min) {
                min = b[i].length();
                s = b[i];
            }
        }
        System.out.println(min);
        System.out.println(s);
        sc.close();
    }
}
// 2nd Method
// import java.util.*;

// public class StringsMinimumLengthOfTheWord {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.nextLine();
// int min = Integer.MAX_VALUE;
// String s = "";
// String b[] = a.split(" ");
// for (String string : b) {
// if (min > string.length()) {
// min = string.length();
// s = string;
// }
// }
// System.out.println(min);
// System.out.println(s);
// sc.close();
// }
// }