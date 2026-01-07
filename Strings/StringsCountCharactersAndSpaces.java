public class StringsCountCharactersAndSpaces {
    public static void main(String[] args) {
        String a = "AAA    ";
        int cc = 0, sc = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                cc++;
            } else {
                sc++;
            }
        }
        System.out.println("Character Count: " + cc);
        System.out.println("Spaces Count: " + sc);
    }
}
