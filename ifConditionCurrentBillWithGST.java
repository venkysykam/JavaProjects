public class ifConditionCurrentBillWithGST {
    public static void main(String[] args) {
        int units = 200;
        int calculate_gst = 0;
        int Total_amount = 0;
        if (units < 100) {
            units = units * 2;
            Total_amount = units;
            System.out.println(Total_amount);
        } else if (units < 200) {
            units = units * 3;
            calculate_gst = units * 15 / 100;
            Total_amount = units + calculate_gst;
            System.out.println(Total_amount);
        } else if (units < 500) {
            units = units * 5;
            calculate_gst = units * 25 / 100;
            Total_amount = units + calculate_gst;
            System.out.println(Total_amount);
        }
    }
}
