public class ifConditionTriangle {
    public static void main(String[] args) {
        int a = 60;
        int b = 65;
        int c = 60;
        if (a == b && b == c && c == a) {
            System.out.println("Equilent Traingle");
        } else if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
            System.out.println("Isolation Traingle");
        } else {
            System.out.println("Scalan Traingle");
        }
    }
}
