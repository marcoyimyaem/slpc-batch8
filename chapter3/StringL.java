package chapter3;

import java.util.Scanner;

public class StringL {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        s1 = "10";
        System.out.println(s2);
        String name = "Marco";
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word ;");
        String palin = input.nextLine();
        StringBuilder palinrev = new StringBuilder(palin);
        String message = (palin.equalsIgnoreCase(palinrev.reverse().toString()))? "Palindrome": "not Palindrome";
        System.out.println(message);
    }
}
