public class StringsVSStringsPull {
    public static void main(String[] args) {
        String a = "Venky";
        String b = "Venky";
        String c = "Venky";
        System.out.println(a == b && b == c && c == a);
        String d = new String("Venky");
        String e = new String("Venky");
        System.out.println(e == d);
    }
}
