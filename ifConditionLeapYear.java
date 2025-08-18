public class ifConditionLeapYear {
    public static void main(String[] args) {
        int y = 2004;
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
