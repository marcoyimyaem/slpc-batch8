package chapter4;

public class DefaultMethodS {
    public static void main(String[] args) {
        MethodL m2 = new MethodL();
        System.out.println(m2.loop()); //public
        System.out.println(m2.loopProtected());
    }
}
