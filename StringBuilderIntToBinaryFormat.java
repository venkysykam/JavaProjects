import java.util.Scanner;

public class StringBuilderIntToBinaryFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        for (int i = n; i > 0; i = i / 2) {// while(n>0){
            if (i % 2 == 0) {
                a = a + "0";// a="0"+a;
            } else {
                a = a + "1";// a="1"+a;
            }
            // n=n/2;
        }
        System.out.print(new StringBuilder(a).reverse().toString());
        // System.out.print(a);
        sc.close();
    }
}
