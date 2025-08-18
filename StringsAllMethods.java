public class StringsAllMethods {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.toUpperCase());
        String c = "HELLO";
        System.out.println(c.toLowerCase());
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.indexOf('H'));
        String d = "World";
        System.out.println(a.concat(d));// System.out.println(a+d);
        String e = "  Hi  Bye";
        System.out.println(e);
        System.out.println(e.trim());// System.out.println(e.strip());
        System.out.println(e.stripLeading());// for Spaces Removes
        System.out.println(e.stripTrailing());
        System.out.println(a.compareTo(c));
        System.out.println(a.startsWith("H"));
        System.out.println(a.endsWith("o"));
        System.out.println(a.substring(1, 4));
        String f = "CIET is Good College";
        String g[] = f.split(" ");
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
        System.out.println(a.codePointAt(0));
        System.out.println(a.codePointBefore(1));
        System.out.println(a.codePointCount(0, 4));
        String h = "";
        System.out.println(h.isEmpty());
        // System.out.println(h.isBlank());
    }
}
