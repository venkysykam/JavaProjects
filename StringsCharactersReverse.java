import java.util.Scanner;

public class StringsCharactersReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for (int i = 0; i < a.length(); i++) {// for(int i=a.length()-1; i>=0; i++)
            char ch = a.charAt(i);// char ch=a.charAt(i);
            b = ch + b;// b=b+ch;
        }
        System.out.println(b);
        sc.close();
    }
}
