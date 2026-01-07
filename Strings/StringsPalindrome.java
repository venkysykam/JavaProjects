import java.util.Scanner;

public class StringsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = a.toLowerCase();
        int l = s.length() - 1;
        int c = 0;
        for (int i = 0; i < s.length(); i++) { // for(int i=0; i<s.length()/2; i++)
            if (s.charAt(i) == s.charAt(l - i)) {// if(s.charAt(i)!=s.charAt(l-i))
                c++;// c++;
                // break;
            }
        }
        if (c == s.length()) { // if(c==(a.length()/2))//if(c==0)
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
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
// String s=a.toLowerCase();
// int left=0;
// int right=s.length()-1;
// int c=0;
// boolean isPalindrome=true;
// while(left<right) {
// if(s.charAt(left)!=s.charAt(right)) {
// isPalindrome=false;
// break;
// }
// left++;
// right--;
// }
// if(isPalindrome) {
// System.out.println("Palindrome");
// }
// else {
// System.out.println("Not a Palindrome");
// }
// }
// }
