package chapter1;

public class RefVsObj {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.out.println("Done");
        
    }
}
