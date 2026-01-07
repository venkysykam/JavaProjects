public class Array2DRowSumMax {
    public static void main(String[] args) {
        int max = 0;
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            max = Math.max(max, sum);
            System.out.println();
        }
        System.out.println(max);
    }
}
