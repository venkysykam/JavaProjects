public class MethodStaticTypes {
    public static void main(String[] args) {
        MethodStaticTypes a = new MethodStaticTypes();
        a.bye();
    }

    public static void hi() {
        System.out.println("Static Types");
    }

    public void hello() {
        hi();
    }

    public void bye() {
        hello();
    }
}
