public class ifConditionThreeNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a == b && b == c && c == a) {
            System.out.println("All are equal");
        } else if (a == b && a != c) {
            System.out.println("a is equal b");
        } else if (a == c && a != b) {
            System.out.println("a is equal c");
        } else if (b == a && b != c) {
            System.out.println("b is equal a");
        } else if (b == c && b != a) {
            System.out.println("b is equal c");
        } else if (c == a && c != b) {
            System.out.println("c is equal a");
        }
        if (c == b && c != a) {
            System.out.println("c is equal b");
        } else {
            System.out.println("All are not equal");
        }
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else if (c > a && c > b) {
            System.out.println("c is greater");
        }

    }
}