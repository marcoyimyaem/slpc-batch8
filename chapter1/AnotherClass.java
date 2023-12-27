package chapter1;
public class AnotherClass {
    {System.out.println("this is an instance ini block");}
    public static void main(String[] args) {
        Main m = new Main();
        AnotherClass s = new AnotherClass();
        m.main(41);
        System.out.println(m.num);
        m.num = 10;
        System.out.println(m.num);
        m.Main();
        Main mm = new Main();
        mm.main(91);
        Main mmm = null;
        
    }
}
