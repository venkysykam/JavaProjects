public class ifConditionCurrentBillWithGSTOneLineCode {
    public static void main(String[] args) {
        int a = 50;
        if (a < 100) {
            System.out.println((a * 2));
        } else if (a < 200) {
            System.out.println((a * 3) + (int) ((a * 3) * 0.15));
        } else if (a < 500) {
            System.out.println((a * 5) + (int) ((a * 5) * 0.25));
        }
    }
}
