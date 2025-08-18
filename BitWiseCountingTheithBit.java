import java.util.Scanner;

public class BitWiseCountingTheithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 0; i <= a; i++) { // while(n>0){
            if ((a & (1 << i)) != 0) { // a=a&(a-1);
                c++; // c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
