public class WhileArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int r = 0;
        int comp = n;
        while (0 < n) {
            r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        System.out.println(sum);
        if (comp == sum) {
            System.out.println("It is Armstrong");
        } else {
            System.out.println("It is not a Armstrong");
        }
    }
}
