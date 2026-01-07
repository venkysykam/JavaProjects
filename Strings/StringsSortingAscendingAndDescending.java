import java.util.Scanner;

public class StringsSortingAscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("Ascending :" + new String(ch) + " ");
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] < ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("Descending :" + new String(ch) + " ");
        sc.close();
    }
}
// 2nd model
// import java.util.*;
// public class Main
// {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// String a=sc.nextLine();
// char[] ch=a.toCharArray();
// Arrays.sort(ch);
// System.out.println(new String(ch));
// }
// }
