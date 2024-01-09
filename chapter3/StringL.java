package chapter3;

public class StringL {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        s1 = "10";
        System.out.println(s2);
        String name = "Marco";
        System.out.println(name.length());
        System.out.println(name.charAt(5));
    }
}
