public class StringsImmutable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        a = a + "World";
        System.out.println(a == b);
    }
}
