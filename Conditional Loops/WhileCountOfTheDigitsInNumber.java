public class WhileCountOfTheDigitsInNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int count = 0;
        while (0 < n) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
