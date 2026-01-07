public class WhilePalindrome {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;
        int rem = 0;
        while (0 < n) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        // n++;
        System.out.println("Reverse No:" + rev);
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
