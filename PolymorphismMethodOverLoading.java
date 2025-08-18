public class PolymorphismMethodOverLoading {
    public static void main(String[] args) {
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
    }

    public static void add(int... x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        System.out.println(sum);
    }
}
