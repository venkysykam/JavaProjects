public class ifelseConditionAgeIncome {
    public static void main(String[] args) {
        int h = 30;
        int w = 28;
        int s1 = 70000;
        int s2 = 40000;
        if (h >= 30 && w >= 28 && s1 >= 70000 && s2 >= 40000) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan not approved");
            if (h < 30) {
                System.out.println("Husband age is insufficient");
            }
            if (s1 < 70000) {
                System.out.println("Husband slary is insufficient");
            }
            if (w < 28) {
                System.out.println("Wife age is insufficien");
            }
            if (s2 < 40000) {
                System.out.println("Wife slary is insufficient");
            }
        }
    }
}
