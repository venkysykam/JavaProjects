import java.util.Scanner;

public class StringsCountSameCharactersWithNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // boolean b=false;//int b=0;
        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            int c = 0;
            // for(int k=0; k<i; k++) {
            // char ch3=a.charAt(k);
            // if(ch1==ch3) {
            // b=true;//b=1;
            // }
            // }
            // if(b)//if(b==1) {
            // continue;
            // }
            if (a.indexOf(ch1) < i) {
                continue;
            }
            for (int j = 0; j < a.length(); j++) {
                char ch2 = a.charAt(j);
                if (ch1 == ch2) {
                    c++;
                }
            }
            System.out.println(a.charAt(i) + " " + c);
        }
        sc.close();
    }
}
