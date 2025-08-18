import java.util.Scanner;

public class StringsCountConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int consonants = 0;
        int vowels = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Consonants Count: " + consonants);
        System.out.println("Vowels Count: " + vowels);
        sc.close();
    }
}
