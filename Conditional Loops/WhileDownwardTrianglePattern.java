public class WhileDownwardTrianglePattern {
    public static void main(String[] args) {
        int n = 12345;
        while (0 < n) {
            System.out.println(n);
            n = n / 10;
        }
    }
}
