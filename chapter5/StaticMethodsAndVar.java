package chapter5;

public class StaticMethodsAndVar {
    public static void one(){}
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.counter+k.counter2);
        StaticMethodsAndVar.one();
        one();
        k=null;
        // System.out.println(k.counter+k.counter2);
        
    }
    
}


class Koala{
    public static int counter;
    int counter2;
    
}