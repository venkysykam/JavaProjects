public class ifConditionEvenAndOddCount {
    public static void main(String[] args) {
        int a = 0, b = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println("Even count=" + a);
        System.out.println("odd count=" + b);
    }
}
